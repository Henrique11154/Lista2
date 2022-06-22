public class Contador {
    private int i = 0;

    public void zerar(){
        this.i = 0;
    }

    public void incrementar(){
        this.i = this.i++;
    }

    public int retornar(){
        return this.i;
    } 
}
