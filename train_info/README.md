# 電車の遅延を知らせるSlack Bot   
## about  
毎朝、京王線と都営新宿線の運行状況を、webページ上からスクレイピングし、Slackにポストします。  
pyInstallerを用いて.exeファイルとし、Windowsのタスクスケジューラで朝に一定間隔で複数回定期実行することを想定しています。   
基本的には、遅延情報がある時(webページから取得したテキストが通常時と異なるとき)だけSlackにポストしますが、  
Botが正常に動作していることを確認するため、各時の00分付近で実行した場合、平常通りでもその旨をポストします。  
  
## 実行例  
![example](https://user-images.githubusercontent.com/16556629/56778002-2ec56f80-680f-11e9-934e-a0d634754b83.PNG)    
## 設定方法  
 incoming-webhook を通じてSlackに投稿しますので、Webhook URLを設定する必要があります  
 URL は api_url.txt に記述してください  
 また、api_url.txt は実行するファイルと同じディレクトリにおいてください    
## 実行環境  
Python 3.7.1  
ライブラリについては requirements.txt をご参照ください。    
## 開発環境  
PyCharm Professional 2019.1.1
