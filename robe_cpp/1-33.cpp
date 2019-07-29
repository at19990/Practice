//
//  1-33.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int main(){
    int a;
    int* p = &a;
    
    a = 0;
    cout << "a = " << a << ", *p = " << *p << endl;
    
    *p = 10;
    cout << "a = " << a << ", *p = " << *p << endl;
    
    return 0;
}
