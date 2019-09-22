//
//  3-2.cpp
//  contest
//
//  Created by at19990 on 2019/08/04.
//  挿入ソート

#include <stdio.h>
#include <iostream>
#include <algorithm>

using namespace std;

void array_print(int A[], int N){
    int i;
    for(i = 0; i < N; i++){
        if(i != N-1){
            cout << A[i] << " " << flush;
        }else{
            cout << A[i] << endl;
        }
    }

}

void insertion_sort(int A[], int N){
    int i, v, j;
    for(i = 1; i < N; i++){
        v = A[i];
        j = i - 1;
        
        while(j >= 0 && A[j] > v){
            A[j + 1] = A[j];
            j--;
        }
        A[j+1] = v;
        array_print(A, N);
    }
}

int main(){
    int N;
    cin >> N;
    
    int A[1001];
    
    for(int i = 0; i < N; i++){
        cin >> A[i];
    }
    array_print(A, N);
    insertion_sort(A, N);
    
}
