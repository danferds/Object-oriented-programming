package agiota;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Agiota {
    private int balance;
    private int nextTrid;
    Map<String,Client> repCli;
    Map<Integer, Transaction> repTr; 
    
     public Agiota(int balance){
        this.balance = balance;
        this.nextTrid = 0;
        repCli = new HashMap<>();
        repTr = new HashMap<>();
    }

    public void addCli(String codename, int limite) {
        if(repCli.containsKey(codename)) {
            System.out.println("fail: cliente ja existe");
        } else {
            repCli.put(codename, new Client(codename, limite));
        }
    }

    public Client getClient(String codename) {
        return repCli.get(codename);
    }

    public void lend(String codename, int value) {
        Client cliente = getClient(codename);
        
        if(cliente == null) {
            System.out.println("fail: cliente nao existe");
        } else if(value > this.balance) {
            System.out.println("fail: fundos insuficientes");
        } else if(cliente.getBalance() + value > cliente.getLimite()) {
            System.out.println("fail: limite excedido");
        } else {
            this.balance -= value;
            cliente.setBalance(cliente.getBalance() + value);
            repTr.put(nextTrid, new Transaction(nextTrid, codename, value));
            nextTrid++;
        }
    }

    public void receive(String codename, int value) {
        Client cliente = getClient(codename);

        if(cliente == null) {
            System.out.println("fail: cliente nao existe");
        } else if(value > cliente.getBalance()) {
            System.out.println("fail: valor maior que a divida");
        } else {
            this.balance += value;
            cliente.setBalance(cliente.getBalance() - value);
            repTr.put(nextTrid, new Transaction(nextTrid, codename, -value));
            nextTrid++;
        }
    }

    public void kill(String codename) {
        repCli.remove(codename);
        Iterator<Map.Entry<Integer, Transaction >> it = repTr.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Integer, Transaction> entry = it.next();

            if(entry.getValue().getCodename().equals(codename)) {
                it.remove();
            }
        }
    }

    public String toString() {
        String retorno = "";
        retorno += "clients:\n";

        for(String codename : repCli.keySet()) {
            retorno += repCli.get(codename).toString() + "\n";
        }

        retorno += "transactions:\n";

        for(int id : repTr.keySet()) {
            retorno += repTr.get(id).toString() + "\n";
        }

        retorno += "balance: " + this.balance;
        
        return retorno;
    }
}