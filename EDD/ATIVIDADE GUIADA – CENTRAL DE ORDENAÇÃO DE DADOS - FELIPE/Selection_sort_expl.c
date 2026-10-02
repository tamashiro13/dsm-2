#include<stdio.h>

void selectionSort(int* v, int n){
	int i, min, j, aux;
	for(i=0; i<n-1; i++){//marca posição para inserir menor elemento
		min=i;//posição menor elemento
		for(j=i+1; j<n;j++){//procura o menor elemento
			
			if(v[min]<v[j]){
				
				min = j;		
			}
		}
		if(v[i]!=v[min]){//troca de posição
			aux = v[i];
			v[i] = v[min];
			v[min] = aux;
		}
	}
}

int main(){
	
	int v[8] = {4,3,6,7,9,10,5,8};
	int i;
	//ordenação decrescente
	selectionSort(v,8);
	
	printf("Vetor Ordenado:");
	for(i=0; i<8;i++){
		printf("%d", v[i]);
	}
	
	return 0;
}