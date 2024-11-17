#include <iostream>

using namespace std;

int main(){
    int firstNum, secondNum, thirdNum, res;
    int number[10] = {0,};
    cin >> firstNum >> secondNum >> thirdNum;
    res = firstNum * secondNum * thirdNum;
    string strRes = to_string(res);
    for (int i = 0; i < strRes.length(); i++) {
        number[(int)(strRes[i]-'0')]++;
    }
    for (int j = 0; j < 10; j++) {
        cout << number[j] << '\n';
    }
    
}
