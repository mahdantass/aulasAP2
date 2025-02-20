import java.util.Random;

//busca binaria -> o vetor tem que estar ordendo -> divide o vetor em dois subvetores
//até encontrar o valor procurado

public class exBuscaBinaria {
	public static void main(String[] args) {
		//criar um array de 1000 posições
		int [] array = new int[1000];
		//preenche o array ordenado
		fillSort(array);
		//exibir o conteudo do array
		printArray(array);
	}
	
	public static void fillSort(int[] v) {
		Random rand = new Random();
		int valorGerado;
		// na primeira caa, gera um valor aleatorio entre 0 e 10
		v[0] = rand.nextInt(10);
				for(int i = 1; i < v.length; i++) {
					//while -> verifica pra fazer; do while -> faz pra verificar
					//gera valores enquanto nã for maior ou igual ao anterior
					do {
					valorGerado = rand.nextInt(100000);	
				}while(valorGerado < v[i - 1]);
					//guarda o valorGerado na posição atual
					v[i] = valorGerado;
	}
}
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("{%d}", array[i]);
		}
		System.out.println();
	}
	
	public static void fill(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	
	public static int buscaBinaria(int[] v, int valor) {
		int inicio, fim, meio;
		//define valores de inicio, meio e fim
		inicio = 0;
		fim = v.length - 1;
		//enquanto inicio for menor ou igual ao fim
		while(inicio <= fim) {
			//calcula o meio
			meio = (inicio + fim)/ 2;
			//compara o meio com o valor procurado
			if(v[meio] > valor) {
				fim = meio - 1;
			}else if(v[meio] < valor) {
				inicio = meio + 1;

			}else {
				//se nao for nem maior nem menor, encontramos
				return meio;
			}
		}	
		
		//passou do wile, retorna não enconrado
		return -1;
	}
}
