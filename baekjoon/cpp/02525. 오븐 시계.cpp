#include <iostream>
using namespace std;

int main(void){
    int h, m, dur;
    cin >> h >> m;  // h : 0~23, m : 0~59
    cin >> dur;
    m = m+dur;
    while (m>=60) {
        if (h == 23) h = 0;
        else h++;
        m = m - 60;
    }

    cout << h << " " << m;
}
