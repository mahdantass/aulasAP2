public class BuscaBinariaRec {
	public static void main(String[] args) {
		int numero[] = {1,2,3,4,8,9,12,25,35,88,125,205,308,400,600};
		int posicao = buscaBinRec(numero, 125, 0, numero.length - 1);
		System.out.println("Posição: "+ posicao);
	}
	
	public static int buscaBinRec(int[] array, int valor, int inicio, int fim) {
		int meio;
		//caso basico
		if(inicio > fim) {
			return -1;
		}
		meio = (inicio +fim) / 2;
		if(array[meio] > valor) {
			return buscaBinRec(array, valor, inicio, meio -1);
		}else if(array[meio] < valor) {
			return buscaBinRec(array, valor, meio + 1, fim);
		}else {
			return meio;
		}
	}

}