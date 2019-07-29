//
//  1-39.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int main(){
    int array[4];
    
    cout << "&array[1]     = " << &array[1] << endl
         << "&array[1] + 1 = " << &array[1] + 1 << endl
         << "&array[2]     = " << &array[2] << endl;
    
    return 0;
}
