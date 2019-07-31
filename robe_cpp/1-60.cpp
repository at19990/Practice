//
//  1-60.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  
//

#include <stdio.h>
#include <iostream>

#define ELEM(array) (sizeof (array) / sizeof *(array))

using namespace std;

struct SStudent{
    char name[16];
    int japanese;
    int math;
    int english;
};

void disp(const SStudent* pstudent){
    cout << "name: " << pstudent -> name << endl;
    cout << "Japanese: " << pstudent->japanese << ", "
    << "Math: " << pstudent->math << ", "
    << "English: " << pstudent->english << endl;
}

int main(){
    SStudent students[] = {
        {"user_1", 73, 98, 86},
        {"user_2", 64, 45, 40},
        {"user_3", 76, 78, 69}
    };

    for(int i = 0; i < ELEM(students); i++){
        disp(&students[i]);
    }

    return 0;
}
