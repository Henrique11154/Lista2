import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] media = new int[5];

        int i = 0;

        while (i < 5){
            System.out.print("Digite um numero inteiro é positivo: ");
            int numero = entrada.nextInt();
            media[i] = numero;
            i++;
    
        }

        i = 0;
        double media2 = 0;
        int quantos = 0;

        while(i < 5){
            if(media[i] %3 == 0){
                media2 = media2 + media[i];
                quantos++;
            }
        i++;
            
        }

        if(quantos == 0){
            System.out.println("Nenhum número divisivel por 3.");
        } else{
            System.out.println("A media é " + media2/quantos);
        }             
    }  
}