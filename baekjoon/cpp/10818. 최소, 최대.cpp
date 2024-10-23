#include <iostream>
using namespace std;


int main(){

    int n, min, max;
    cin >> n;
    int arr[n];
    
    for (int i = 0; i < n;i++){
        cin >> arr[i];
        if (i==0) min = max = arr[0];
        else if (max < arr[i]) max = arr[i];
        else if (min > arr[i]) min = arr[i];
        
    }
    cout << min << " " << max;


    return 0;
}
