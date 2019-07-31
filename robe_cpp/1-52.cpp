//
//  1-52.cpp
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
    char buffer[128];

    pFile = fopen("file_1-51.txt", "r");
    fgets(buffer, 128, pFile);
    cout << "file_1-51.txtの中身は、「" << buffer << "」です" << endl;
    fclose(pFile);

    return 0;
}
