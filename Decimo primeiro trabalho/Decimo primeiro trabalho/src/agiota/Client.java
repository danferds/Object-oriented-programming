package agiota;

public class Client {
    private int balance;
    private String codename;
    private int limite;

    public Client(String codename, int limite) {
        this.codename = codename;
        this.limite = limite;               
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCodename() {
        return this.codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public int getLimite() {
        return this.limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String toString() {
        return String.format("- %s:%d/%d", getCodename(), getBalance(), getLimite());
    }
}