//
//  2-5.cpp
//  contest
//
//  Created by Atsuya TSUDA on 2019/08/01.
//

#include <stdio.h>
#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int N;
    cin >> N;
    
    int price[N+1];
    
    for(int i = 0; i < N; i++){
        cin >> price[i];
    }
    
    int maxv = -2000000000;
    int minv = price[0];
    
    for(int i = 1; i < N; i++){
        maxv = max(maxv, price[i] - minv);
        minv = min(minv, price[i]);
    }
    
    cout << maxv << endl;
    
    return 0;
}




