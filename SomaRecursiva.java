public class SomaRecursiva {
    public static void main(String[] args) {
        System.out.println(somaRecursiva(5));
    }

    public static int somaRecursiva(int n){
        if(n == 0){
            return 0;
        }else{
            return n + somaRecursiva(n - 1);
        }
    }
}