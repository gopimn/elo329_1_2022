#include <iostream>
#include <fstream>
#include "A.h"
using namespace std;


int main()
{
    Gvector Z (1,2);
    Gvector Y (2,3);
    if (Z<Y)
    cout << "\n\nZ<Y\n"<<endl;
    else
    cout << "\n\nZ>Y\n"<<endl;
}