#include <Stdio.h>
void main() {
int arr[5]={10,20,30,40,50};
int *ptr=arr;
printf("Intial pointer value:\n");
printf("Adress:%p,value:%d\n,ptr,*ptr");
ptr++;
printf("\nAfter incrementing pointer by 1:\n");
printf("Adress:%p,Value:%d\n",ptr,*ptr);
ptr++;
printf("\nAfter incrementing pointer by 1 again:\n");
printf("Adress:%p,value:%d\n",ptr,*ptr);
}
