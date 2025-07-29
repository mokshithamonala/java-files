#include <stdio.h>

int main() {
    int a[100], position, i, n, value;

    printf("Enter the size of array: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for(i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    printf("Enter the position to insert (0 to %d): ", n);
    scanf("%d", &position);

    if(position < 0 || position > n) {
        printf("Invalid position!\n");
        return 1;
    }

    printf("Enter the value to insert: ");
    scanf("%d", &value);


    // Shift elements to the right
    for(i = n; i > position; i--) {
        a[i] = a[i - 1];
    }

    a[position] = value;
    n++;  // Increase size of array

    printf("Resultant array is:\n");
    for(i = 0; i < n; i++) {
        printf("a[%d] = %d\n", i, a[i]);
    }

    return 0;
}
