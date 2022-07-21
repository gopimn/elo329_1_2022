#ifndef A_H
#define A_H
#include <iostream>
using namespace std;

class Gvector{
int x,y;
public:
    Gvector () {};
    Gvector(double, double);
    ~Gvector() {}
    friend bool operator < (Gvector a, Gvector b);
};
#endif