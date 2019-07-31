//
//  1-51.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
// 
//

#include <iostream>
#include <stdio.h>

using namespace std;

int main(){

    FILE* pFile;

    pFile = fopen("file_1-51.txt", "w");
    fputs("ファイルに書き込みます", pFile);
    fclose(pFile);

    cout << "書き込み完了" << endl;

    return 0;
}
