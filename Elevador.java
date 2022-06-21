public class Elevador {
    private int andares;
    private int qualAndar = 0; //andar em que o elevador esta
    private int capacidade; //capacidade do elevador

    public Elevador(int andares, int qualAndar, int capacidade) {
        this.andares = andares;
        this.qualAndar = qualAndar;
        this.capacidade = capacidade;
    }

    public void entrar(int n, int pessoasElevador){ // pessoas que entrarao no elevador
        if (pessoasElevador >= capacidade){
            System.out.println("Não é possivel adicionar mais pessoas");
        }else{
            pessoasElevador = pessoasElevador + n; // adicionar mais uma pessoa no elevador
        }
    }

    public void sair(int n, int pessoasElevador){
        if (pessoasElevador > 0){
            System.out.println("Não é possivel remover mais pessoas");
        }else{
            pessoasElevador = pessoasElevador - n; // diminuir uma pessoa no elevador
        }
    }
    
    public void subir(int s){
        if(qualAndar == andares){
            System.out.println("O elevador esta no ultimo andar");
        }else{
            this.qualAndar = this.qualAndar++;
        } 
    }

    public void descer(int d){
        if (qualAndar == 0){
            System.out.println("O elevador esta no térreo");
        }else{
            this.qualAndar--;
        }
    }

}
