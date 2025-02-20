package array;

import java.util.Iterator;
import java.util.Random;

public class Revisao1 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] vetor = new int [10];
		//é possivel criar uma matriz mesmo sem o segundo valor matriz = new int[4][], porem a matriz vai sempre esperar receber um vetor de inteiros
		int[][] matriz = new int[4][5];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(100);
		}
		
		for(int i = 0; i < vetor.length; i++) {
			//%n quebra a linha; %d se usa quano tem a necessidade de usar um valor inteiro
			System.out.printf("Posição: %d : %02d%n", i,  vetor[i]);
		}
	}
}
