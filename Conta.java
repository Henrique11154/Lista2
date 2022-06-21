public class Conta {
    
    private String nome;
    private float saldo;
    private int numeroConta;
    
    public Conta(String nome, float saldo, int numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void deposito(float n){
        this.saldo = this.saldo + n;
    }

    public void sacar (float n){
        this.saldo = this.saldo - n;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

}
