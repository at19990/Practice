//
//  1-16.cpp
//  practice
//
//  Created by Atsuya TSUDA on 2019/07/21.
//  Copyright © 2019 Atsuya TSUDA. All rights reserved.
//

#include <iostream>

using namespace std;

int n_results[] = {
    641, 703, 405, 598, 402, 752, 330,   0, 445, 662,
    254, 710, 467, 530, 548, 485, 244, 396, 601, 510,
    532, 687, 623, 420, 647, 587, 490, 647, 575, 688,
    764, 633, 712, 312, 655, 425, 722, 631, 680, 602
};

int main(){
    int n_sum = 0;
    
    for(int i = 0; i < 40; i++){
        n_sum += n_results[i];
    }
    
    cout << "｀クラスの平均点は " << n_sum / 40.0 << " 点です" << endl;
    
    return 0;
}
