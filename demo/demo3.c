#include <stdio.h>

int binary_search(int arr[], int size, int target)
{
    int left = 0;
    int right = size - 1;

    while (left <= right)
    {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
        {
            return mid; // 找到目标元素，返回其下标
        }
        else if (arr[mid] < target)
        {
            left = mid + 1; // 在右半部分继续查找
        }
        else
        {
            right = mid - 1; // 在左半部分继续查找
        }
    }

    return -1; // 没有找到目标元素，返回-1
}

int main()
{
    int arr[] = {1, 3, 5, 7, 9};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target = 7;

    int result = binary_search(arr, size, target);

    if (result != -1)
    {
        printf("Found %d at index %d\n", target, result);
    }
    else
    {
        printf("%d not found in array\n", target);
    }

    return 0;
}