import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        
        while(i <= 10){
            System.out.print("Digite um número positivo: ");
            double n = entrada.nextDouble();
            if (n < 0){
                System.out.println("Este número é negativo.");
            }else{
                System.out.println(Math.sqrt(n));
                i++;
            }
        }
    }
}
