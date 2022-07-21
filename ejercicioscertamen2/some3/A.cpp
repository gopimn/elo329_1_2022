
#include <cmath>
#include "A.h"

Gvector::Gvector (double a, double b) {
  x = a;
  y = b;
}
bool operator < (Gvector a, Gvector b)
{
    return sqrt(pow(a.x,2)+pow(a.y,2)) < sqrt(pow(b.x,2)+pow(b.y,2));
}

// sobre carga operador << como función global.
ostream & operator << (ostream &os, const CVector &v) {
  os << "(" << v.x << "," << v.y << ")";
  return os;
}


