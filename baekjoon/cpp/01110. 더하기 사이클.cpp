#include <iostream>

using namespace std;

int main(){
    int input, temp, left, right, cnt = 0;
    cin >> input;
    temp = input;

    while (1) {   
        if (temp < 10) {
            temp = temp*11;
        }
        else {
            left = temp/10;
            right = temp%10;
            temp = (left + right)%10 + right*10;
        }  
        cnt++;

        if (input == temp) break;

    }
    cout << cnt;
}
