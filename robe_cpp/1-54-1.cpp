//
//  1-54-1.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  
//

#include <stdio.h>
#include <iostream>
#include <string.h>

using namespace std;

int main(){
    FILE* pFile;
    char buffer[512];

    cout << "文字列を入力してください: " << flush;
    cin >> buffer;

    pFile = fopen("file_1-54.txt", "w");
    fprintf(pFile, "%d\n", (int)strlen(buffer));
    for(int i = 0; buffer[i]; i++){
        fprintf(pFile, "%02X ", (unsigned char)buffer[i]);
    }
    fclose(pFile);

    return 0;
}
