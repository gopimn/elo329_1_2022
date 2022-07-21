#ifndef A_H
#define A_H
#include <iostream>
using namespace std;

class A{
public:
int x;
A() {x=3;}
~A()
{   
    cout << "Destruccion!!" <<endl;
}
    int * getpx();
    int & getrx();
};
#endif