#include<stdio.h>
void main() {
int a[10],index,i,n;
printf("Enter the size of array:\n");
scanf("%d,&n");
printf("Enter array elements:\n");
for(i=0;i<n;i++){
scanf("%d,&index");
if(index>n){
printf("Deletion not possible\n");
}
else{
for(i=index;i<=n;i++){
a[i]=a[i+1];
}
printf("Resultant array:\n");
for(i=0;i<n;i++){
printf("%d\n",a[i]);
}}}}
