public class Lampada {
    
    private boolean ligar = false;

    public void ligarDesligar(){
        if (this.ligar == true){
            this.ligar = false;
        }else{
            this.ligar = true;
        }
    }

    public boolean isLigar() {
        return ligar;
    }

    
}
