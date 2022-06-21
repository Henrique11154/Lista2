import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para calcular os 20 primeiros multiplos: ");
        int n = entrada.nextInt();


        for(int i = 0; i <= 20; i++){
            System.out.println(n*i);

        }  
    }
}
