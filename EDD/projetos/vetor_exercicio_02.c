#include <stdio.h>

int main (){
	int soma=0, v1[5], v2[5], i;
	
	for (i=0;i<5;i++){
		printf ("Digite os numeros: ");
		scanf ("%d",&v1[i]);
	}
	
	for (i=0;i<5;i++){
		printf ("Digite os numeros: ");
		scanf ("%d",&v2[i]);
	}
	
	for (i=0;i<5;i++){
		soma = v1[i] + v2[i];
		printf ("\n a soma dos numeros sao: %d",soma);
	}
}