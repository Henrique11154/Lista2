public class Contador {
    private int i;

    public void zerar(){
        this.i = 0;
    }

    public void incrementar(){
        this.i = i++;
    }

    public int retornar(){
        return this.i;
    } 
}
