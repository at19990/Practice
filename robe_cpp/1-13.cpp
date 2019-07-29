//
//  1-13.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int convert_to_heisei(int year){
    if(1989 <= year && year <= 2019){
        return year - 1988;
    }else{
        return 0;
    }
}

void heisei(){
    int year;
    
    cout << "西暦を入力してください: " << flush;
    cin >> year;
    
    int converted = convert_to_heisei(year);
    
    if(converted){
        if(converted == 1){
            cout << "その年は平成 元 年です" << endl;
        }else{
            cout << "その年は平成 " << converted << " 年です" << endl;
        }
        
    }else{
        cout << "その年は平成ではありません" << endl;
    }
}

int main(){
    heisei();
    heisei();
    
    return 0;
}
