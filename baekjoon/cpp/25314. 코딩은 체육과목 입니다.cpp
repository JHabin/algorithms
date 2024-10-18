#include <string>
#include <iostream>
using namespace std;


int main(void){

    int nbyte;
    string btype = "long";
    
    cin >> nbyte;
    for (int i=0;i<nbyte/4;i++){
        cout << btype << " ";
    }
    cout << "int";
    return 0;
}
