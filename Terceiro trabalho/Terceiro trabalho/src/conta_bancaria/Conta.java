package conta_bancaria;

class Conta {
    private String titular;
    private int numero = 0;
    private double saldo;
    private static int totalContas = 0;
    
    public Conta(String titular) { 
        this.titular = titular;
        this.numero = totalContas;
        totalContas++;
        this.saldo = 0.00;
    }

    void setDepositar(double valor) {
        this.saldo += valor;
    }

    static void deposita(Conta conta, double valor){
        conta.saldo += valor;
    }

    boolean sacar(double valor) {

        if(getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }

    static void saca(Conta conta, double valor){
        if(conta.saldo >= valor) {
            conta.saldo -= valor;
        }
        else {
            System.out.printf("Conta ficou zerada após o saque %.2f reais\n", conta.saldo);
            conta.saldo = 0.00;
        }
    }

    boolean transfere(Conta conta, double valor){
        if(conta.numero == this.numero) {
            this.saldo += valor;
            return true;
        } else
            return false;
    }

    static boolean transfere(Conta origem, Conta destino, double valor){
        origem.saldo -= valor;
        destino.saldo += valor;
        return true;
    }

    public String toString(){
        return String.format("Nro da conta: %d, Titular: %s, Saldo: %.2f", numero, titular, saldo);
    }

    double getSaldo(){
        return this.saldo;
    }
}