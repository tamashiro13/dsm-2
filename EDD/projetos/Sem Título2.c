#include<stdio.h>

int main(){
	int i=1,divisor=0,j=1;
	
	while(i<=100){//gera os números de 1 a 100
		while(j<=i){//gera os valores de 1 a i
			if(i%j == 0){//verifica se o i eh divisivel por j
				divisor ++;
			}
			j++;
		}//primo: divisel 
		if(divisor == 2){
			printf("%d eh primo \n",i);
		}
		divisor = 0; //reseta valor de divisor
		j=1; //reseta valor de j
		i++; // inceremneta o valor de i
	}
}