//
//  1-34.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  
//

#include <iostream>

using namespace std;

void convert_to_heisei(int* p){
    if(1989 <= *p && *p <= 2019){
        *p -= 1988;
    }else{
        *p = 0;
    }
}

void heisei(){
    int year;

    cout << "西暦を入力してください: " << flush;
    cin >> year;

    convert_to_heisei(&year);

    switch (year) {
        case 0:
            cout << "その年は平成ではありません" << endl;
            break;
        case 1:
            cout << "その年は平成 元 年です" << endl;
            break;
        default:
            cout << "その年は平成 " << year << "年です" << endl;
            break;
    }

}

int main(){
    heisei();
    heisei();

    return 0;
}
