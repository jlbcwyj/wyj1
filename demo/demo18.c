#include <stdio.h>
#include <stdlib.h>
int main()
{
    int *iIntMalloc = (int *)malloc(sizeof(int));
    *iIntMalloc = 100;
    printf("%d\n", *iIntMalloc);
    int *iIntFree = (int *)malloc(sizeof(int));
    *iIntFree = 200;
    printf("%d\n", *iIntFree);

    free(iIntMalloc);
    free(iIntFree);
    printf("%d\n", *iIntMalloc);
    printf("%d\n", *iIntFree);
    return 0;
}