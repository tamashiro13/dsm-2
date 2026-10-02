#include<stdio.h>

void insertionSort(int* v, int n){
	
	int j, i=0, aux;
	for(j=1;j<n;j++){//percorrer o vetor(deixa o vetor ordenado quando j=787u )
		
		aux = v[j];
		i = j-1;
		//i>= 0 : permite que possa se deslocar para esquerda no máximo chega na primeira posição
		//v[i]>aux: compara os elementos determina o local correto para inserir
		while((i >=0) && (v[i]>aux)){
			//desloca elementos para direita precisa abrir espaço para inserir o elemento nolocal correto 
			v[i+1] = v[i];
			//Desloca para esquerda o contador
			i--;
		}
		//insere elemento na posição vazia
		v[i+1]=aux;
	}
	
}

int main(){
	
	int v[8] = {4,3,6,7,9,10,5,8};
	int i;
	//ordenação decrescente
	insertionSort(v,8);
	
	printf("Vetor Ordenado:");
	for(i=0; i<8;i++){
		printf("%d", v[i]);
	}
	
	return 0;
}