import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[];
        int i = 0;

        boolean T = true;

        while (T == true){
            System.out.print("Digite um número: ");
            int n = entrada.nextInt(); //numero
            if(n<0){
                System.out.println("Digite um número positivo");
            }else{
                vetor = new int [n];
                System.out.print("Você deseja outro numero: (s/n) ");
                String   opcao = entrada.next(); // continua a pedir um número
                int media = vetor[i] / vetor.length;
                i++;
                if(opcao == "s" || opcao == "S"){
                    System.out.print("Digite um número: ");
                    n = entrada.nextInt();
                }else{
                    System.out.println(media);
                    T = false;
                } 
            }
        }
    }
}
