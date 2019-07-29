//
//  1-18.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int main(){
    
    int i = 0;
    
    do{
        cout << "i = " << i << endl;
        i += 2;
    }while(i < 10);
    
    cout << "ループ終了" << endl;
}
