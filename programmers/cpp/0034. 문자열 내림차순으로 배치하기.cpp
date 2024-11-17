#include <string>
#include <algorithm>

using namespace std;

bool compare(int i, int j) {
    return j < i;
}
string solution(string s) {
    string answer = "";
    sort(s.begin(), s.end(), compare);
    answer = s;
    return answer;
}
