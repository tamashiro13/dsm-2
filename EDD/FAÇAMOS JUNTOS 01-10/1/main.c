#include <stdio.h>

int multiplica(int a, int b){
	if(a==1){//caso base
		return b;
	}else{//caso geral
		return b+multiplica(a-1, b);	
	}
}
int main() {
	int a=4, b=3, resultado;
	resultado = multiplica(a, b);
	printf("multiplicacao (%d) = %d",a,b,resultado);
		
	return 0;
}