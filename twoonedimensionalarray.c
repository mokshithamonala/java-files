#include<stdio.h>
void main() {
int a[20],b[20],i,n1,n2;
printf("Enter the size of first array:\n");
scanf("%d",&n1);
printf("Enter the size of second array:\n");
scanf("%d",&n2);
printf("Enter first array elements:\n");
for(i=0;i<n1;i++) {
scanf("%d",&a[i]);
}
printf("Enter second array elements:\n");
for(i=0;i<n2;i++){
scanf("%d",b[i]);}
printf("Merged elements are:\n");
for(i=0;i<n2;i++){
scanf("%d",&b[i]);}
n2=n1+n2;
for(i=0;i<n2;i++){
a[n1+i]=b[i];}
printf("Merged elements are:\n");
for(i=0;i<n2;i++){
printf("%d",a[i]);}
}


