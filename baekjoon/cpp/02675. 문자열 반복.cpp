#include <iostream>
#include <string>
using namespace std;

int main(){
    int testNum, repeat;
    string str;
    cin >> testNum;
    while (testNum-- > 0) { // 마지막 테스트 케이스도 처리
        cin >> repeat >> str;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < repeat; j++) {
                cout << str[i];
            }
        }
        cout << "\n"; // 각 테스트 케이스마다 줄바꿈
    }

    return 0;
}
