package buscabinaria;


import java.util.Random;
import java.util.Scanner;

public class ExemploBuscas {

	public static void main(String[] args) {
		// variÃ¡veis
		Scanner sc = new Scanner(System.in);
		int qtdElem, valorProc, posic;
		int vetor[];
		long inic, fim, duracao;
		// interaÃ§Ã£o com o usuÃ¡rio
		System.out.println("Informe o nÃºmero de elementos do vetor");
		qtdElem = sc.nextInt();
		// instanciar o vetor
		vetor = new int[qtdElem];
		// chama o mÃ©todo para preencher o vetor
		preencher(vetor);
		// solicita ao usuÃ¡rio um nÃºmero a ser buscado
		System.out.println("Qual valor deseja buscar no vetor?");
		valorProc = sc.nextInt();
		// armazena na variÃ¡vel posic o retorno da busca
		posic = encontrar(valorProc, vetor);
		// captura o momento do inÃ­cio
		inic = System.currentTimeMillis();
		if (posic >= 0) {
			System.out.printf
			("\u001B[32mValor encontrado na posiÃ§Ã£o %d!!!%n", posic);
		} else {
			System.out.println("\u001B[31mValor nÃ£o encontrado!!!");
		}
		// captura o momento de tÃ©rmino
		fim = System.currentTimeMillis();
		// calcula a duraÃ§Ã£o
		duracao = fim - inic;
		// exibe a duraÃ§Ã£o
		System.out.printf("Tempo de duraÃ§Ã£o: %d milisegundos", duracao);
	}

	public static int encontrar(int num, int[] vetor) {
		// variÃ¡vel para retorno
		int posicao = -1;
		// percorrer o vetor e buscar o valor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				// caso encontre, altera o valor da variÃ¡vel posicao
				posicao = i;
				// encerra o for
				break;
			}
		}
		// retorna o resultado
		return posicao;
	}

	public static boolean buscar(int num, int[] vetor) {
		// variÃ¡vel para retorno
		boolean achou = false;
		// percorrer o vetor e buscar o valor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				// caso encontre, altera o valor da variÃ¡vel achou
				achou = true;
				// encerra o for
				break;
			}
		}
		// retorna o resultado
		return achou;
	}

	/**
	 * Preenche o array com valores aleatÃ³rios entre 0 e 1000
	 * 
	 * @param v array a ser preenchido
	 */
	public static void preencher(int[] v) {
		Random rand = new Random();
		// percorrendo os elementos e preenchendo com valores aleatÃ³rios
		for (int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(0, 1000);
		}
	}

}
