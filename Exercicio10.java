import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = e.next();

        System.out.print("Digite o seu saldo: ");
        float s = e.nextFloat(); //saldo 
        
        System.out.print("Digete o numero da conta");
        int c = e.nextInt(); //conta

        Conta conta = new Conta(nome, s, c);

        System.out.println("1 - para depositar dinheiro");
        System.out.println("2 - para sacar o dinheiro");
        System.out.print("3 - ver saldo ");
        int opcao = e.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Sua conta: "+conta.getNumeroConta());
                System.out.println("Quanto deseja depositar: ");
                int n = e.nextInt();
                conta.deposito(n);
                break;
            case 2:
                System.out.println("Sua conta: "+conta.getNumeroConta());
                System.out.println("Quanto deseja sacar: ");
                n = e.nextInt();
                conta.sacar(n);
                break;
            case 3:
                System.out.println("Sua conta: "+conta.getNumeroConta());
                System.out.println("Seu saldo: "+conta.getSaldo());
                break;
        }

    }
}
