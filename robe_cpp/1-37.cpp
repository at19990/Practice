//
//  1-37.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int main(){
    int a;
    int& r = a;
    
    a = 0;
    
    cout << "a = " << a << ", r = " << r << endl;
    
    r = 100;
    
    cout << "a = " << a << ", r = " << r << endl;
    cout << "&a = " << &a << ", &r = " << &r << endl;
}
