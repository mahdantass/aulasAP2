public class PotenciaRecursiva{
    public static void main(String[] args) {
        
    }

public static double potencia(double b, double e){
    if(e == 0){
        return 1;
    }else{
        return b * potencia(b, e - 1);
    }
    }
}