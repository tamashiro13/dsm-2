#include<stdio.h>

void merge(int vetor[], int inicio, int meio, int fim){
	int i,j,k;
	int n1 = meio-inicio+1;
	int n2 = fim-meio;
	int esq[n1], dir[n2];

	for(i=0;i<n1;i++){
		esq[i]=vetor[inicio+i];
	}
	for(j=0;j<n2;j++){
		dir[j]=vetor[meio+1+j];
	}

	i=0; j=0; k=inicio;

	while(i<n1 && j<n2){
		if(esq[i]<=dir[j]){
			vetor[k]=esq[i];
			i++;
		}else{
			vetor[k]=dir[j];
			j++;
		}
		k++;
	}

	while(i<n1){
		vetor[k]=esq[i];
		i++;
		k++;
	}

	while(j<n2){
		vetor[k]=dir[j];
		j++;
		k++;
	}
}

void mergeSort(int vetor[], int inicio, int fim){
	int meio;

	if(inicio<fim){
		meio=(inicio+fim)/2;

		mergeSort(vetor,inicio,meio);
		mergeSort(vetor,meio+1,fim);

		merge(vetor,inicio,meio,fim);
	}
}

int main(){
	int vendas[] = {450,120,890,320,75,640,210,530};
	int tamanho = 8, i;

	for(i=0;i<tamanho;i++){
		printf("%d ",vendas[i]);
	}
	
	printf("\n");
	
	mergeSort(vendas,0,tamanho-1);

	for(i=0;i<tamanho;i++){
		printf("%d ",vendas[i]);
	}
}
