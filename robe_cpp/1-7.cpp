//
//  1-7.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int func(int x, int y){
    return 2 * x + y;
}

int main(int argc, const char * argv[]) {
    // insert code here...
    cout << "func(1, 2) = " << func(1, 2) << endl;
    cout << "func(182, 144) = " << func(182, 144) << endl;
    
    return 0;
}
