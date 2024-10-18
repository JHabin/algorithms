#include <iostream>
using namespace std;

int main(void){

    int ntotal, ptotal, n, price;
    int res = 0; 
    cin >> ptotal;
    cin >> ntotal;
    for (int i=0;i<ntotal;i++){
        cin >> price >> n;
        res += price*n;
    }    
    if (ptotal==res) cout << "Yes";
    else cout << "No";
    return 0;
}
