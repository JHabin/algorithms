#include <iostream>
using namespace std;


int main(){
    int firstNum, secondNum;
    cin >> firstNum >> secondNum;
    int firstComp = (firstNum%10)*100 + (firstNum%100/10)*10 + (firstNum/100);
    int secondComp = (secondNum%10)*100 + (secondNum%100/10)*10 + (secondNum/100);
    
    int res = (firstComp > secondComp)? firstComp : secondComp;
    cout << res;

    return 0;
}
