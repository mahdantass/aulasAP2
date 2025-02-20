package array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ExemploBusca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long inicio, fim, duracao;
		int qtdElementos, valorProc, vetor[];
		//int[] vetor;
		
		//interação com o usuario
		
		System.out.println("Informe o número de elementos: ");
		qtdElementos = scanner.nextInt();
		
		//instanciar o vetor
		vetor = new int[qtdElementos];
		
		//chama o metodo para preencher o vetor
		preencher(vetor);
		
		System.out.println("Qual valor deseja buscar no vetor? ");
		valorProc = scanner.nextInt();
		
		//captura o inicio
		inicio = System.currentTimeMillis();
		if(buscar(vetor, valorProc)) {
			System.out.println("\u001B[32mO valor foi encontrado!");
		}else {
			System.out.println("\u001B[31mO valor não foi encontrado!");
		}
		//captrua o momento de termino
		fim = System.currentTimeMillis();
		
		//exibe a duração
		duracao = fim - inicio;
		System.out.printf("Duração: " , duracao);
 	}
	/**
	 * Preenche o array com valores aleatoriso entre 0 e 1000
	 * @param v array a ser preenchido
	 */
	 
	public static void preencher(int[] v) {
		Random rand = new Random();
		for(int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(0, 100);
		}
	}	
	
	/**
	 * Busca o valor que foi digitado pelo usuario e returna um boolean 
	 * @param vetor é o vetor do usuario
	 * @param valor é valor que deve ser procurado
	 * 
	 * @return retorna true ou false
	 */
	public static boolean buscar(int[] vetor, int valor) {
		boolean achou = false;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == valor) {
				achou = true;
			}
		}
		return achou;
	}
}
