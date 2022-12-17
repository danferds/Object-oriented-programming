package agiota;

public class Transaction {
    private String codename;
    private int id;
    private int value;

    public Transaction(int id, String codemane, int value) {
        this.id = id;
        this.codename = codemane;
        this.value = value;
    }
    
    public String getCodename() {
        return this.codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return this.id;
    } 

    public String toString() {
        return String.format("- id:%d %s:%d", getId(), getCodename(), getValue());
    }
}