#include <stdio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void insertionSort(int * v, int n){
	int j, aux;
	for(j=1;j<n;j++){// percorre o vetor
		aux = [j];
		i = j-1;
		// i >= 0 : desloca para esquerda no máximo chega na primeira posição
		// v[i]>aux : compara os elementos determina o local correto para inserir
		while((~i >= 0) && (v[i]>aux)){
			// desloca elementos para direita
			// precisa abrir espaço
			// para inserir o elemento 
			// no local correto
			v[i+1] = v[i];
			// desloca para a esquerda o
			// contador até achar a posição
			// correta
			i--;
		}
		// insere elemento na posção vazia
		v[i+1] = aux;
		
	}
}
int main() {
	int v[8]={4,3,6,7,9,10,5,8};
	int i;
	return 0;
}