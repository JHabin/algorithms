#include <iostream>
using namespace std;

int main() 
{
    int n1, n2;
    cin >> n1 >> n2;

  	double dn1 = static_cast<double>(n1);
  	double dn2 = static_cast<double>(n2);

    cout << fixed;
	  cout.precision(9);
    cout << dn1/dn2;
    return 0;
}
