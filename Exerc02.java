package NUP1_EstruturaDeDados;

public class Exerc02 {
    public static void main(String[] args) {
        int x = 5;
        int result = fatorialDoNumero(x);
        System.out.println(result);
    }

    public static int fatorialDoNumero(int x){
        int fatorialX = 1;
        int fatorialY = 1;
        for (int i = 1; i <= x; i++){
            fatorialX *= i;
        }
        return fatorialX;
    }
}
