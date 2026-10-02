#include <stdio.h>

int fibonacci(int n){
	if(n==0){
		return 0;
	}
	if(n==1){
		return 1;
	}else{
		return fibonacci(n-1) + fibonacci(n-2);
	}
};

int main(){
	int n=6, resultado;
	resultado = fibonacci(n);
	printf("fibonacci  %d", resultado);
	return 0;
}