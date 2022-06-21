import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Contador i = new Contador();

        Scanner e = new Scanner(System.in);

        System.out.println("Para zerar o contador digite 1");
        System.out.println("Para incrementar o contador digite 2");
        System.out.print("Para ver o contador digite 3");
        int opcao = e.nextInt();

        switch(opcao){
            case 1:
                i.zerar();
                break;
            case 2:
                i.incrementar();
                break;
            case 3:
                i.retornar();
                break;
        }

    }
}