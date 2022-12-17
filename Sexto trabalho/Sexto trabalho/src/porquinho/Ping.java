package porquinho;

import java.util.ArrayList;

class Pig {
    private ArrayList<String> itens = new ArrayList<String>();
    private double value = 0;
    private int volume = 0;
    private int volumeMax;
    private boolean broken = false;

    public Pig(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public boolean addCoin(Coin moeda) {
        if(isBroken() == false && getVolume() != getVolumeMax()) {
            this.value += moeda.value;
            this.volume += moeda.volume;
            return true;
        } else {
            return false;
        }
    }

    public boolean addItem(Item item) {
        if(isBroken() == false && getVolume() != getVolumeMax()) {
            this.volume += item.getVolume();
            this.itens.add(item.getDescription());
            return true;
        } else {
            return false;
        }
    }

    public boolean breakPig() {
        return this.broken = true;
    }

    public double getCoins() {
        if(isBroken() == true) {
            return this.value;
        } else {
            System.out.println("You must break the pig first");
        }

        return 0.0;
    }

    public String getItens() {
        String retorno = "";

        if(isBroken() == true) {
            for(int i = 0; i < itens.size(); i++) {
                if(i == 0)
                    retorno += itens.get(i);
                else
                    retorno += ", " + itens.get(i);
            }

        } else {
            System.out.println("You must break the pig first");
        }

        return retorno;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getVolumeMax() {
        return this.volumeMax;
    }

    public boolean isBroken() {
        if(this.broken == false) 
            return false;
        else 
            return true;
    }

    public String toString() {
        String retorno = "I:(";

        for(int i = 0; i < itens.size(); i++) {
            if(i == 0)
                retorno += itens.get(i);
            else
                retorno += ", " + itens.get(i);
        }

        retorno += ")" + " M:" + this.value + " V:" + getVolume() + "/" + getVolumeMax() + " EQ:" + broken;

        return retorno;
    }
}