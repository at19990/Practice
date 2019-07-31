//
//  1-29.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  
//

#include <iostream>

#define N 16

using namespace std;

int main(){
    int n_fibo[N] = {1, 1};

    for(int i = 0; i < N - 2; i++){
        n_fibo[i+2] = n_fibo[i] + n_fibo[i+1];
    }

    cout << "フィボナッチ数列の第 1 項から第 " << N << "項は、" << endl;

    int j;
    for(j = 0; j < N - 1; j++){
        cout << n_fibo[j] << ", " << flush;
    }

    cout << n_fibo[j] << " です" << endl;

    return 0;
}
