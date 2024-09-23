#include <stdio.h>

typedef char * string;

typedef struct {
    string title;
    string author;
    int pages;
}

int main()
{
    Book book1;
    book1.title = "dune";
    book1.author = "Frank Herbert";
    book1.pages = 1;

    printf("%s\n", book1.title);

    return 0;
}