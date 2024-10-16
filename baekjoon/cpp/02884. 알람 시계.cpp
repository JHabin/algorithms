#include <iostream>
using namespace std;

int main(void){
    int h, m;
    cin >> h >> m;  // h : 0~23, m : 0~59
    if (m >= 45) {
        m = m-45;
    }
    else {
        if (h == 0) h = 23;
        else h--;
        m = 60-(45-m);
    }

    cout << h << " " << m;
}
