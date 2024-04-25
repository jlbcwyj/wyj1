
#include <stdio.h>

int main()
{
    int rows = 50; // 三角形的行数

    for (int i = 1; i <= rows; i++)
    {
        // 打印每行的空格
        for (int j = 1; j <= rows - i; j++)
        {
            printf(" ");
        }

        // 打印每行的星号和间隔空格
        for (int j = 1; j <= 2 * i - 1; j++)
        {
            if (j % 2 == 0)
            {
                printf(" ");
            }
            else
            {
                printf("*");
            }
        }

        printf("\n");
    }

    return 0;
}