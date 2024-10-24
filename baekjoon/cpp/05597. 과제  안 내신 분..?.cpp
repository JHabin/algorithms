#include <iostream>
using namespace std;

int main(){
    int inputArray[31] = {0,};
    int input;
    for (int i=0;i<28;i++){
        cin >> input;
        inputArray[input] = 1;
    }
    for (int j=1;j<=30;j++){
        if (!inputArray[j]) cout << j << '\n';
    }
    return 0;
}
