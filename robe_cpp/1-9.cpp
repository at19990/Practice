//
//  1-9.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
// 
//

#include <iostream>

using namespace std;

int a = 0;

void inc(){
    static int b = 0;
    int c = 0;

    a++;
    b++;
    cout << "a = " << a << ", b = " << b << ", c = " << c << endl;

    return;
}

int main(){
    inc();
    inc();
    inc();

    return 0;
}
