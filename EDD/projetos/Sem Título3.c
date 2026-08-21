#include<stdio.h>

int main(){
	int op,num1=6,num2=2;
	do{
		printf("1 - SOMA \n");
		printf("2 - SUBTRACAO \n");
		printf("3 - MULTIPLICACAO \n");
		printf("4 - DIVISAO \n");
		printf("5 - SAIR \n");
		scanf("%d",&op);
	
	switch(op){
		case 1:
			printf("Soma = %d \n", num1+num2);
		break;
		case 2:
			printf("Subtracao = %d \n", num1-num2);
		break;
		case 3:
			printf("Multiplicacao = %d \n", num1*num2);
		break;
		case 4:
			printf("Divisao = %d\n", num1/num2);
		break;
		case 5:
			printf("Bye bye! \n");
		break;
		default:
			printf("Ops! Opcao errada!\n");
	}
		
	}while(op != 5);
}