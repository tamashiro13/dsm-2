#include <stdio.h>

int main () {
	float media,nota1,nota2,nota3,nota4,nota5;
	
	printf ("Informe a nota 1:");
	scanf ("%f",&nota1);
	
	printf ("Informe a nota 2:");
	scanf ("%f",&nota2);
	
	printf ("Informe a nota 3:");
	scanf ("%f",&nota3);
	
	printf ("Informe a nota 4:");
	scanf ("%f",&nota4);
	
	printf ("Informe a nota 5:");
	scanf ("%f",&nota5);
	
	media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
	
	printf ("Media: %f",media);
}