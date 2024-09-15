#include <stdbool.h>
#include <stdio.h>

void kiir(int szam, int tomb[]) {
  for (int i = 0; i < szam; ++i) {
    printf("%d", tomb[i]);
  }
}

int fin_number(int n, int tomb[], int szam) {

  for (int i = 0; i < n; ++i) {
    if (tomb[i] == szam) {
      return i;
    }
  }
  return -1;
}

int main() {

  int tomb[] = {1, 2, 3, 4, 5, 6, 7};
  int meret = sizeof(tomb);

  kiir(meret, tomb);

  int res = fin_number(meret, tomb, 3);
  printf("%d", res);

  return 0;
}