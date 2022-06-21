import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Lampada l = new Lampada();
        Scanner e = new Scanner(System.in);

        System.out.print("LIGAR A LAMPADA? (s/n) ");
        String opcao = e.next();

        if(opcao == "s" || opcao == "S"){
            l.ligarDesligar();
            System.out.println(l);
        }
    }
}
