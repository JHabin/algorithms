#include <algorithm>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    int na, nb;
    na = min(a,b);
    nb = max(a,b);
    return (long long)(nb - na + 1)*(na + nb)/2;
}
