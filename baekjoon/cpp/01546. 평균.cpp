#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int subjectNum, sum = 0;
    cin >> subjectNum;

    int score[subjectNum];
    for (int i = 0; i < subjectNum; i++){
        cin >> score[i];
        sum += score[i];
    }
    int scoreSize = sizeof(score) / sizeof(score[0]);
    double res = (double)(sum * 100) / (*max_element(score, score + scoreSize) * subjectNum ); 
    cout << res;
    return 0;
}
