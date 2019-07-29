//
//  1-44.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>
#include <math.h>

using namespace std;

int main(){
    double a, b;
    
    cout << "直角をはさむ2辺の長さを空白区切で入力してください: " << flush;
    cin >> a >> b;
    
    cout << "斜辺の長さは " << sqrt(pow(a, 2) + pow(b, 2)) << " です" << endl;
    
    return 0;
}
