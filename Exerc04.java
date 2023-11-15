package NUP1_EstruturaDeDados;

public class Exerc04 {
    public static void main(String[] args) {
        int x = 6;
        if (numeroPerfeito(x)){
            System.out.println("O número é perfeito.");
        }else System.out.println("O número não é perfeito.");

    }
    public static boolean numeroPerfeito(int x){
        int perfeito = 0;
        for (int i = 1; i <= x / 2; i++){
            if( x % i == 0) {
                perfeito += i;
            }
        }
        return perfeito == x;
    }
}
