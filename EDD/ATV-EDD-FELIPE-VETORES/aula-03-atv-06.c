#include <stdio.h>

int main () {
	int i, v1[5], v2[5], s=0,m=0,p=0;
	float d=0;
	
	for(i=0;i<5;i++){
	printf("Digite os primeiros elementos: ");
	scanf("%d",&v1[i]);
	}
	for(i=0;i<5;i++){
	printf("Digite os segundos elementos: ");
	scanf("%d",&v2[i]);
	}
	
	//a. A soma dos elementos de cada vetor, nas respectivas posições;
	for(i=0;i<5;i++){
		if (i == i){
			s= v1[i] + v2[i];
		}
	printf("As somas dos elementos de cada vetor sao: %d\n",s);
	}
	
	//b. A diferença dos elementos de cada vetor, nas respectivas posições;
	for(i=0;i<5;i++){
		if (i == i){
			m= v1[i] - v2[i];
		}
		printf("As diferencas dos elementos de cada vetor sao: %d\n",m);
	}
	
	//c. O produto dos elementos de cada vetor, nas respectivas posições;
	for(i=0;i<5;i++){
		if (i == i){
			p= v1[i] * v2[i];
		}
		printf("O produto dos elementos de cada vetor sao: %d\n",p);
	}
	
	//d. A divisão entre os elementos de cada vetor, nas respectivas posições (verificar divisão por zero).
	for(i=0;i<5;i++){
		if (i == i){
			d= v2[i] / v1[i];
		}
		printf("A divisao entre os elementos de cada vetor sao: %.2f\n",d);
	}
}