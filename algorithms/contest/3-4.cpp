//
//  3-4.cpp
//  contest
//
//  Created by at19990 on 2019/08/04.
//  選択ソート

#include <stdio.h>
#include <iostream>
#include <algorithm>

using namespace std;

void array_print(int A[], int N, int counter){
    for(int i = 0; i < N; i++){
        if(i != N-1){
            cout << A[i] << " " << flush;
        }else{
            cout << A[i] << endl;
        }
    }
    cout << counter << endl;
}

void selection_sort(int A[], int N){
    
    int i, j, minj;
    int counter = 0;
    for(i = 0; i < N - 1; i++){
        minj = i;
        for(j = i; j < N; j++){
            if(A[j] < A[minj]){
                minj = j;
            }
        }
        swap(A[i], A[minj]);
        if(i != minj){
            counter++;
        }
    }
    array_print(A, N, counter);
    
}

int main(){
    int N;
    int A[101];
    
    cin >> N;
    
    for(int i = 0; i < N; i++){
        cin >> A[i];
    }
    
    selection_sort(A, N);
    
}
