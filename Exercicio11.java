import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in); //entrada de dados

        System.out.print("Quantos andares existem nesse predio: ");
        int floors = e.nextInt(); // andares
        System.out.print("Quantas pessoas pode ficar nesse elavador: ");
        int pessoas = e.nextInt();

        Elevador elevator = new Elevador(floors,0,pessoas);

        for (int i = 0;i == 0; i = i){

            System.out.println("1 - para entrar");
            System.out.println("2 - para sair");
            System.out.println("3 - para subir");
            System.out.println("4 - para descer");
            int opcao = e.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Quantas pessoas então no elevador: ");
                    int en = e.nextInt(); //pessoas que estão no elevador

                    System.out.print("Quantas pessoas vão entrar: ");
                    int pn = e.nextInt(); //pessoas que vão entrar no elevador
                    elevator.entrar(pn, en);
                    break;
                case 2:
                    System.out.print("Quantas pessoas então no elevador: ");
                    en = e.nextInt(); 

                    System.out.print("Quantas pessoas sair do elevador: ");
                    pn = e.nextInt(); //pessoas que vão sair do elevador
                    elevator.sair(pn, en);
                    break;
                case 3:
                    System.out.print("Qual andar o elevedor esta: ");
                    int andar = e.nextInt();
                    elevator.subir(andar);
                    break;
                case 4:
                    System.out.print("Qual andar o elevedor esta: ");
                    andar = e.nextInt();
                    elevator.descer(andar);
                    break;
            }
        }
    }
}
