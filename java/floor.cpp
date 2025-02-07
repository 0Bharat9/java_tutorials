#include <iostream>
#include <math.h>
using namespace std;

double floor_fn(double n) { return 1 / (2 * floor(n) - n + 1); }

int main() {
  double n = 1;
  double res;
  res = floor_fn(n);
  while (n < 20) {
    cout << res << endl;
    res = floor_fn(res);
    n++;
  }
}
