#include<stdio.h>
void main() {
int j=0;
do
{
if(j==7)
{
j++;
continue;
}
printf("%d",j);
j++;
}
while(j<10);
}
