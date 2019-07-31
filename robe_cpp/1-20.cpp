//
//  1-20.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
// 
//

#include <iostream>

using namespace std;

int main(){

    double a, b;
    int sign;
    double result;

    for(int i = 0; i < 5; i++){
        cout << "第1項: " << flush;
        cin >> a;

        cout << "第2項: " << flush;
        cin >> b;

        cout << "どの演算を行いますか(1:加算, 2:減算, 3:乗算, 4:除算): " << flush;
        cin >> sign;

        if(b == 0 && sign == 4){
            cout << "0除算はできません" << endl;
            continue;
        }

        switch (sign) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                cout << "入力が不正です" << endl;
                continue;
        }
        cout << "答えは " << result << " です" << endl;
    }

    return 0;
}
