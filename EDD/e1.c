#include<stdio.h>

int main(){
	int i=1,v;
	
	while(i<=500){
		if(i%3 == 0){
			if(i%2 == 1) {
				printf("%d \n",i);
				v = i+i;
				printf ("%d ",i);
			}
			i++;
		}
	}
}
