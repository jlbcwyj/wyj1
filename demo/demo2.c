#include <stdio.h>
int main()
{
    int a = 0, b = 0, c = 0, d = 0;
    (a++) && (b++) ? c++ : d++;
    printf("%d %d %d %d", a, b, c, d);
    return 0;
}