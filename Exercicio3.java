import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = entrada.nextInt();

        long fatorial = 1;

        for(int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial );
        
    }

}