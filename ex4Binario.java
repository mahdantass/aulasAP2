public class ex4Binario {
    public static void main(String[] args) {
        int[][] array = new int [10][10];
        int valor = 0;
        //preencher o array
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = valor++;
            }
        }
        int[] coord = buscaBinaria(array,44);
        System.out.println(coord[0]);
        System.out.println(coord[1]);
    }

    public static int[] buscaBinaria(int[][] array, int valor){
        //variavel para retorno
        int[] coord = {-1, -1};
        int inicio, meio, fim;
        //for para passar pelas linhas da matriz
        for(int linha = 0; linha < array.length; linha++){
            fim = array[linha].length - 1;
            if(array[linha][fim] < valor){
                //vai para o 'proximo passo' do loop
                continue;
            }
            inicio = 0;
            while(inicio <= fim){
                meio = (inicio + fim) / 2;
                if(array[linha][meio] > valor){
                    fim = meio - 1;
                }else if(array[linha][meio] < valor){
                    inicio = meio + 1;
                }else{
                    return new int[] {linha, meio};
                }
            }

        }
        //retorna a posição do valor não encontrado
        return coord;
    }
}
