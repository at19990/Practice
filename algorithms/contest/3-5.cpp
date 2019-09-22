//
//  3-5.cpp
//  contest
//
//  Created by at19990 on 2019/08/04.
//  安定なソート

#include <stdio.h>
#include <iostream>
#include <algorithm>

using namespace std;

struct Card{
    char suit;
    char value;
};

void bubble(struct Card C1[], int N){
    for(int i = 0; i < N; i++){
        for(int j = N - 1; j > i; j--){
            if(C1[j].value < C1[j - 1].value){
                swap(C1[j], C1[j-1]);
            }
        }
        
    }
}

void selection(struct Card C2[], int N){
    for(int i = 0; i < N; i++){
        int minj = i;
        for(int j = i; j < N; j++){
            if(C2[j].value < C2[minj].value){
                minj = j;
            }
        }
         swap(C2[i], C2[minj]);
    }
}

void print(struct Card C[], int N){
    for(int i = 0; i < N; i++){
        if(i != N-1){
            cout << C[i].suit << C[i].value << " " << flush;
        }else{
            cout << C[i].suit << C[i].value << endl;
        }
    }
}

string stability(struct Card C1[], struct Card C2[], int N){
    string judge = "Stable";
    for(int i = 0; i < N; i++){
        if(C1[i].suit != C2[i].suit){
            judge = "Not stable";
        }
    }
    return judge;
}

int main(){
    Card C1[100], C2[100];
    
    int N;
    cin >> N;
    for(int i = 0; i < N; i++){
        cin >> C1[i].suit >> C1[i].value;
    }
    for(int i = 0; i < N; i++){
        C2[i] = C1[i];
    }
    
    bubble(C1, N);
    selection(C2, N);
    
    
    print(C1, N);
    cout << "Stable" << endl;
    print(C2, N);
    cout << stability(C1, C2, N) << endl;
    
    
}
