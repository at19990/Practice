//
//  3-3.cpp
//  contest
//
//  Created by at19990 on 2019/08/04.
//  バブルソート

#include <stdio.h>
#include <iostream>
#include <algorithm>

using namespace std;

void print_array(int A[], int N, int counter){
    for(int i = 0; i < N; i++){
        if(i > 0){
            cout << " "<< flush;
        }
        cout << A[i] << flush;
    }
    cout << endl;
    cout << counter << endl;
}

void bubble_sort(int A[], int N){
    static int counter = 0;
    bool flag = 1;
    for(int i = 0; flag; i++){
        flag = 0;
        for(int j = N-1; j >= i + 1; j--){
            if(A[j] < A[j-1]){
                int tmp = A[j-1];
                A[j-1] = A[j];
                A[j] = tmp;
                flag = 1;
                counter++;
            }
        }
    }
    print_array(A, N, counter);
}

int main(){
    int N;
    cin >> N;
    
    int A[101];
    for(int i = 0; i < N; i++){
        cin >> A[i];
    }
    bubble_sort(A, N);
}
