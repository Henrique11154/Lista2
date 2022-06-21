import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i = 0;
        String contatos;

        while (i <4){
            System.out.println("Menu");
            System.out.println("a - Adicionar contato");
            System.out.println("b - Buscar contato");
            System.out.println("c - Remover contato");
            System.out.println("d - editar contato");
            System.out.println("e - Sair");
            
            System.out.print("O que você quer fazer? ");
            char opcao = entrada.nextLine().charAt(0);
        }                
    }
}           