
public class BubbleSort {
	public static void main(String[] args) {
		int numeros[] = {5, 7, 8, 3, 1, 25, 0, 87, 9, 2, 10};
		ordenar(numeros);
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i] + "");
	}
}
	public static void trocar(int[] v, int p1, int p2) {
		//variavel auxiliar
		int temp = v[p1];
		v[p1] = v[p2];
		v[p2] = temp;
	}
	
	public static void ordenar(int[] vetor) {
		int trocas = 0;
		for(int i = 0; i < vetor.length; i++) {
			//variavel para indicar se houve troca
			boolean troca = false;
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j + 1]){
					trocas++;
					//caso haja troca, sinalize na variavel troca
					troca = true;
					trocar(vetor, j, j + 1);
				}
			}
			if(!troca) {
				break;
			}
		}
		System.out.println(trocas);
	}
}
