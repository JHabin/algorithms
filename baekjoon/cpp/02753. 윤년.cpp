#include <iostream>
using namespace std;

int main(void){
    int year, res;
    cin >> year;
    res = (((year%4==0)&&(year%100!=0))||(year%400==0))? 1:0;
    cout << res;
    return 0;
}
