#include <stdio.h>

void bubbleSort(int * v, int n){
	int i, fim, aux;
	for(fim=n-1;fim>0;fim--){
	for(i=0;i<fim;i++){
		if(v[i] > v[i+1]){
			aux = v[i];
			v[i] = v[i+1];
			v [i+1] = aux;
		}	
	}
	}
}

int main (){
	int v[8]={4,3,6,7,9,10,5,8};
	int i;
	// ordenação crescente
	
	bubbleSort(v,8);
	printf("\n Vetor ordenado: ");
	for(i=0;i<8;i++){
		printf("%d ", v[i]);
	}
	return 0;
}