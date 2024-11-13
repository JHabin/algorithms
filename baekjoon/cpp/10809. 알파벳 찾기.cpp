#include <string>
#include <iostream>

using namespace std;

int main(){
    int alphabet[26];
    fill_n(alphabet, 26 , -1);
    string str;
    cin >> str;
    for (int i = 0; i < str.length(); i++) {
        if ( alphabet[((int)str[i])-97] == -1 ) {
            alphabet[(int)str[i]-97] = i;
        }
        else continue;
    }
    for (int j = 0; j < 26; j++) {
        cout << alphabet[j] << ' ';
    }
    
}
