#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
char name[100];
char*description;
strcpy(name,"Mokshitha");
description=malloc(30*sizeof(char));
if(description=NULL)
{
fprintf(stderr,"Error-unable to allocate required memory\n");

else{
strcpy(description,"Mokshitha as a c programmer");}}
}
