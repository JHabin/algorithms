#include <iostream>
using namespace std;

int main(void){

    int n, a, b;
    cin >> n;
    int arr[n]; 
    for (int i=0;i<n;i++){
        cin >> a >> b;
        arr[i] = a+b;
        
    }
    for (int j=0;j<n;j++){
        cout << arr[j] << endl;
    }
    return 0;
}
