package junk_food;

public class VendingMachine {
    private Slot[] slots;
    private float profit;
    private float cash;
    private int capacity;

    public VendingMachine(int capacity) {
        slots = new Slot[capacity];

        for(int i = 0; i < capacity; i++) {
            slots[i] = new Slot();
        }

        this.profit = 0;
        this.cash = 0;
        this.capacity = capacity;
    }

    public Slot getSlot(int index) {
        return slots[index];
    }

    public void setSlot(int index, Slot s) {
        slots[index] = s;
    }

    public void clearSlot(int index) {
        if(index < 0 || index > capacity) {
            System.out.println("fail: indice nao existe");
        } else {
            slots[index] = new Slot("empty", 0, 0);
        }
    }

    public void insertCash(float cash) {
        this.cash += cash;
    }

    public float withdrawCash() {
        float quantoTinhaSaldo = this.cash;
        this.cash = 0;
        return quantoTinhaSaldo;
    }

    public float getCash() {
        return this.cash;
    }

    public float getProfit() {
        return this.profit;
    }

    void buyItem(int index) {
        if(index < 0 || index > capacity) {
            System.out.println("fail: indice nao existe");
        } else if(slots[index].getQuantity() == 0) {
            System.out.println("fail: espiral sem produtos");
        } else if(slots[index].getPrice() > getCash()) {
            System.out.println("fail: saldo insuficiente");
        } else {
            this.cash -= slots[index].getPrice();
            System.out.println("voce comprou um " + slots[index].getName());

            if(slots[index].getQuantity() >= 1) {
                int quantidadeAtual = slots[index].getQuantity();
                quantidadeAtual--;
                slots[index].setQuantity(quantidadeAtual);
            }
        }
    }

    public String toString() {
        String retorno = String.format("saldo: %.2f", this.cash) + "\n";

        for(int i = 0; i < capacity; i++) {
            retorno += i + slots[i].toString();
            
            if(i != capacity - 1) {
                retorno += "\n";
            }
        }

        return retorno;
    }
}