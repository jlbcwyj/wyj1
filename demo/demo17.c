#include <stdio.h>
void DisplayB(char *string)
{
    printf("%s\n", string);
}
void DisplayA(char *string)
{
    char String[20] = "LoveWorld!";
    printf("%s\n", String);
    DisplayB(string);
}
int main()
{
    char String[20] = "HelloWorld!";
    DisplayA(String);
    DisplayB(String);
    return 0;
}