//
//  1-43.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  
//

#include <iostream>

using namespace std;

int main(){
    int num1, num2;

    cout << "2つの値を空白区切で入力してください: " << flush;
    cin >> num1 >> num2;

    cout << "大きい方の値は、" << ((num1 > num2) ? num1 : num2) << "です" << endl;

    return 0;
}
