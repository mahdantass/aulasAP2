import java.util.Arrays;

public class BinariaCompareTo {
    public static void main(String[] args) {
    	//array de 50 palavras
        String[] palavras = {
            "amor", "amizade", "felicidade", "vida", "alegria", "esperança", "sabedoria", "paz", "respeito", "generosidade",
            "coragem", "força", "determinação", "sucesso", "família", "solidariedade", "liberdade", "realização", "inovação", "sonho",
            "compaixão", "sabedoria", "gratidão", "carinho", "responsabilidade", "disciplina", "honestidade", "entusiasmo", "gentileza", "empatia",
            "persistência", "criatividade", "motivação", "fé", "amor-próprio", "comprometimento", "colaboração", "generosidade", "justiça", "equilíbrio",
            "saúde", "autenticidade", "foco", "autodisciplina", "curiosidade", "humildade", "felicidade", "determinação", "otimismo", "sabedoria"
        };
        
        //ordena o array de palavras em ordem lexicográfica
        
      Arrays.sort(palavras);
        
    }

    public static int buscaBinaria(String[] array, String palavra){
    // variaveis
    int inicio, fim, meio;
    //definir os valores iniciais das variaveis
    inicio = 0;
    fim = array.length - 1;
    //enquano o inicio <= fim
    while(inicio <= fim){
        //calcula o meio
        meio = (inicio + fim) / 2;
        // se a string do meio for "maior"
        if(array[meio].compareTo(palavra) > 0){
            fim = meio - 1;
        // se a string do meio for "menor"
        }else if(array[meio].compareTo(palavra) < 0){
            inicio = meio + 1;
        // se a string procurada estiver no meio
        }else{
            return meio;
        }
    }
    return - 1;
    }
}