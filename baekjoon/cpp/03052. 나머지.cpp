#include <iostream>
using namespace std;

int main(){
    int inputArray[10], n;
    int cnt = 10;
    for (int i=0;i<10;i++){
        cin >> n;
        inputArray[i] = n % 42;
        for (int j=0;j<i;j++){
            if ( inputArray[i] == inputArray[j]) {
                cnt--;
                break;
            } 
        }
    }
    cout << cnt;

    return 0;
}
