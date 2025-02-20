package array;

import java.util.Random;

public class Revisao3 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][10];
		matriz[0] = new int[7];
		matriz[1] = new int[12];
		matriz[2] = new int[5];
		matriz[3] = new int[17];
		
		preencher(matriz);
		imprimir(matriz);
	}
	public static void preencher(int[][] m) {
		Random rand = new Random();
		
		for(int j = 0; j < m.length; j++) {
			for(int i = 0; i < m[j].length; i++) {
				m[j][i] = rand.nextInt(100);
			}
		}
	}
	
	public static void imprimir(int[][] m) {
		for(int j = 0; j < m.length; j++) {
			for(int i = 0; i < m[j].length; i++) {
				System.out.printf("%02d ",  m[j][i]);
			}
			System.out.println();
		}
		
	}

}
