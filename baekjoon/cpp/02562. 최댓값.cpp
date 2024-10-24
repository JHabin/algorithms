#include <iostream>
#define TOTAL 9
using namespace std;

int main(){
    int n,index, max = 0;

    for (int i=0;i<TOTAL;i++){
        cin >> n;
        if (n>max) {
            max = n;
            index = i;
        }
    }
    cout << max << "\n" << index + 1;
    
    return 0;
}
