#include <stdio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int divisao(int a, int b){
	if(a == 0){
		return 0;
	}else{
		return 1 + divisao(a-b,b);
	}
}
int main() {
	int resultado = (10,3);
	printf("%d", resultado);
	return 0;
}