#include <stdio.h>

int main() {

  int x = 5;
  int *p = &x;

  printf("%d", x);
  printf("cime: %p", &x);

  *p = 10;
  printf("%d", x);

  return 0;
}