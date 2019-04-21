# coding:utf-8
from urllib import request
from bs4 import BeautifulSoup
import requests
import json
import datetime
import os

# 京王線と都営新宿線の運行情報をスクレイピングして平日毎朝Slackに通知を投げる
# pyInstallerで実行ファイルを作成し、タスクスケジューラで実行(月・水→6:30～, 火・木・金→8:30～ 15分ごとに4回実行)することを想定
# cronによる定期実行 → そのうち対応

# このファイルと同じディレクトリに api_url.txt を置き、Slack Incoming WebhooksのURLを記述する
target_path = os.path.join(os.path.dirname(__file__), 'api_url.txt')
file_open1 = open(target_path, 'r')
api_url = file_open1.read()
file_open1.close()

now = datetime.datetime.now()

# 京王の運行情報を取得
def get_keio():
    url = "https://www.keio.co.jp/unkou/unkou_pc.html"

    html = request.urlopen(url)

    soup = BeautifulSoup(html, "html.parser")

    # <p class="status"> ここを抽出 </p>
    keio_info = soup.find("p", attrs={"class", "status"})

    return keio_info.text


# 都営新宿線の運行情報を取得
def get_toei():
    url = "http://www.jikokuhyo.co.jp/search/detail/line_is/kanto_toeishinjuku"

    html = request.urlopen(url)

    soup = BeautifulSoup(html, "html.parser")

    # <div class="corner_block_row_detail_d"> ここを抽出 </div>
    toei_info = soup.find("div", attrs={"class", "corner_block_row_detail_d"})

    return toei_info.text


# 遅延が発生しているときのslack投稿
def send_slack_delay(keio_info, toei_info):
    content = '*【京王】*\n      ' + keio_info + '\n\n*【都営】*\n      ' + toei_info
    payload = {
        "username": "Train Infomation",
        "attachments": [
            {
                "color": "#D00000",     # 赤色のバーを表示
                "text": content,
                "mrkdwn_in": ["text"]
            }
        ]
    }
    data = json.dumps(payload)

    requests.post(api_url, data)


# 遅延が発生していないときのslack投稿
def send_slack_usual():
    # 日時の判定
    # 遅延が無いとき、基本的には何もしないが、正常動作していることを確認するため毎日最低1回はポストする
    # 7:00の実行(月・水)と9:00の実行(火・木・金)で遅延情報なしをポスト(時間の判定には幅をもたせておく)
    # 7:00 の判定と 9:00 の判定を併記すると複雑になるので分割→もっとスマートな書き方があるはず...
    if ((now.hour == 6) and (55 <= now.minute <= 59)) or ((now.hour == 7) and (0 <= now.minute <= 5)):
        content = str(now.hour) + "時現在、遅延の情報はありません"
        payload = {
            "username": "Train Infomation",
            "attachments": [
                {
                    "color": "#7CD197",     # 緑色のバーを表示
                    "text": content
                }
            ]
        }
        data = json.dumps(payload)

        requests.post(api_url, data)
    elif ((now.hour == 8) and (55 <= now.minute <= 59)) or ((now.hour == 9) and (0 <= now.minute <= 5)):
        content = str(now.hour) + "時現在、遅延の情報はありません"
        payload = {
            "username": "Train Infomation",
            "attachments": [
                {
                    "color": "#7CD197",
                    "text": content
                }
            ]
        }
        data = json.dumps(payload)

        requests.post(api_url, data)
    else:
        pass


# リターン末尾の改行を削除
keio_info = get_keio().rstrip('\n')

# リターン先頭の改行を削除
toei_info = get_toei().lstrip('\n')

# keio_infoかtoei_infoの少なくとも片方が通常時の値でないとき、遅延と判定
# 京王線については、平常時のテキストのあとに追加して宣伝用の文言が入ることがある
# →平常通りの文言が含まれるかどうかで判定
# 都営新宿線については完全一致で判定
if (not('京王線・井の頭線は平常通り運転しています。' in keio_info)) or (toei_info != '現在、平常通り運転しています。'):
    send_slack_delay(keio_info, toei_info)
else:
    send_slack_usual()
