#include <iostream>
using namespace std;

int main(void){
    int a, b;
    int res1, res2, res3;
    cin >> a >> b;
    res1 = a*(b%10);
    res2 = a*((b/10)%10);
    res3 = a*(b/100);
    cout << res1 << endl;
    cout << res2 << endl;
    cout << res3 << endl;
    cout << res1 + res2*10 + res3*100 << endl;
    
    return 0;
}
