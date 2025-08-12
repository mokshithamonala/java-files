#include<stdio.h>
#include<string.h>
int main()
{
char name[100];
char*description;
strcpy(name,"Mokshitha");
description =malloc(200*sizeof(char));
if(description==NULL)
{
fprintf(stderr,"Error-unable to allocate required memory\n");
}
else{
strcpy(description,"Mokshitha as a c programmer");
}
printf("Name=%s\n",name);
printf("Description:%s\n",description);
}
