#include <iostream>
using namespace std;

int main(void){
    int x, y, res;
    cin >> x >> y;
    if (y > 0) {
        if (x > 0) res = 1;
        else if (x < 0) res = 2;
    }
    else if (y < 0) {
        if (x < 0) res = 3;
        else if (x > 0) res = 4;
    }
    cout << res;
}
