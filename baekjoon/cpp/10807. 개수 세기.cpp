#include <iostream>
using namespace std;


int main(){
    int n, question, cnt = 0;
    cin >> n;
    int arr[n];

    for (int i = 0; i < n;i++){
        cin >> arr[i];
    }
    cin >> question;
    for (int a : arr){
        if (a == question)
            cnt++;
    }
    cout << cnt;
    return 0;
}
