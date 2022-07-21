#ifndef A_H
#define A_H
#include <iostream>
using namespace std;

class A{

public:
void f(){
        cout << "AA" << endl;
}
};

class B{

public:
void f(){
        cout << "BB" << endl;
}
};

class C: public A, public B{
};
#endif