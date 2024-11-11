#include <string>
#include <iostream>

using namespace std;

int main(){
    string input;
    int cnt = 1;
    
    getline(cin, input);
    if (input.length() == 1 && input[0] == ' ') {
		cout << 0;
		return 0;
	}

	for (int i = 1; i < input.length() - 1; i++) {
		if (input[i] == ' ') cnt++;
	}

    cout << cnt;
    return 0;
}
