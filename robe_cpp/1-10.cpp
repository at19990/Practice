//
//  1-10.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int main(){
    int user_input;
    
    cout << "値を入力してください: " << flush;
    cin >> user_input;
    
    cout << "(入力) mod 3 = " << user_input % 3 << endl;
    
}
