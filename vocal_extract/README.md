# Vocal Extractor    
## 概要 (About)
ボーカル入りの楽曲とそのカラオケ音源からボーカル部分のみを抽出するプログラムです。  
リミックスの作成やDNN用の学習データの生成などの用途を想定しています。

This program extracts a vocal part from a vocal mixed and a karaoke sound source.  The uses of this tool are making a remix material, generate learning data for DNN and so on.    

## 使用方法 (How to use)    
このプログラムは、16bit, サンプリング周波数44.1kHzのwav形式について処理することができます。  
コマンドで、
```
>> python vocal_extract.py {ボーカル入音源ファイル名} {カラオケ音源ファイル名} {出力ファイル名(.wav)} {楽曲の先頭探索のしきい値(0.01~0.1推奨)}  
```
のように入力すると実行できます    

It can process only WAVE files (sampling bit rate:16bit, sampling frequency: 44.1kHz).  
```
>> python vocal_extract.py {mixed_path} {karaoke_path} {output_file_name(.wav)} {volume_threshold (recommended 0.01~0.1)}
```  
As shown above, you need to input in command.  

## 原理 (Method)
カラオケ音源の位相を反転して、ボーカル入り音源と合成することで、オケの部分だけを消去する仕組みです。  
各音源の先頭部分は、ユーザー入力のしきい値を超える部分を探索して、プログラムが自動で決定します。    

By inverting a phase of a karaoke source and synthesize with a mixed audio source, This script only eliminates instrumental part.  
The heads of each audio source are determined automatically through detecting the part which exceeds the user-input-threshold.    

## 注意事項 (Hints)  
次のような楽曲では抽出がうまくいかないことがあります。  
- 前奏のない楽曲  
- ボーカル入音源とカラオケ音源でmixが異なる場合  
- 楽曲の開始地点がボーカル入音源とカラオケ音源で10秒以上ずれている場合    

In the specific types of an audio source such as listed below,  Sometimes you could fail to extraction.
-  The song which not contained prelude part
-  A vocal mixed source's mixing or volume is significantly different from karaoke source.
-  The head of the vocal source is different from the karaoke source for more than 10 seconds.     

## 実行環境 (Requirements)
Python 3.7.1  
必要なライブラリについては、__requirements.txt__を参照の上適宜インストールしてください。    

About libraries, please refer to __requirements.txt__
