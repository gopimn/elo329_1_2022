#include <iostream>
#include <fstream>
#include "A.h"
using namespace std;


int main()
{
    A v;
    //v.getrx() = 7;
    A *p = &v;
    v.x--;
    cout << "\n\n\n\np->getrx() = \n\n\n"<<p->getrx()<<endl;
}