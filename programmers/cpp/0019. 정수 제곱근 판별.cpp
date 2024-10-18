#include <string>
#include <vector>
using namespace std;

long long solution(long long n) {
    long long res = 0;
    long long k = 1;
    while (res < n){
        res += 2*k - 1;
        k++;
        if (n == res) return k*k;
        
    }
    return -1;    
}
