#include <stdio.h>
#include <stdlib.h>
int main()
{
    int *plnt;
    plnt = (int *)malloc(sizeof(int));
    *plnt = 100;
    printf("the number is:%d\n", *plnt);
    free(plnt);
    return 0;
}