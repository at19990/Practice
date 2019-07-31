//
//  1-54-2.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  
//

#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    FILE* pFile;
    int n_length;
    int tmp;

    pFile = fopen("file_1-54.txt", "r");

    if(pFile == NULL){
        cout << "ファイルの中身がありません" << endl;
        return 0;
    }

    fscanf(pFile, "%d", &n_length);
    cout << "文字列の長さは " << n_length << " バイトです" << endl;

    for(int i = 0; i < n_length; i++){
        fscanf(pFile, "%x", &tmp);
        putchar(tmp);
    }

    fclose(pFile);

    return 0;
}
