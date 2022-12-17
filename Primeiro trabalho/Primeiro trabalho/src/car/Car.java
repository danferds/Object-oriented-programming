package car;

public class Car{
    private int pass;
    private int passMax; 
    private int gas;
    private int gasMax;
    private int km;
    
    public Car() {
        this.pass = 0;
        this.passMax = 2;
        this.gas = 0;
        this.gasMax = 100;
        this.km = 0;
    }

    /** 
     * Adiciona um passageiro por vez até atingir o limite máximo.
     */
    public void enter() {
        if(this.pass < this.passMax)
            this.pass++;
        else
            System.out.println("fail: limite de pessoas atingido");
    }

    /**
     * Retira um passageiro por vez.
     */
    public void leave() {
        if(this.pass != 0)
            this.pass--;
        else
            System.out.println("fail: nao ha ninguem no carro");
    }

    /**
     * Abastece o carro até atingiar a capacidade total.
     * @param gas - Quantidade de combustível. 
     */
    public void fuel(int gas) {
        this.gas += gas;

        if(this.gas > this.gasMax)
            this.gas = this.gasMax;
    }


    /**
     * Dirige o carro caso haja passageiros e combustível suficiente. 
     * @param km - Quantidade de km a ser percorrido.
     */
    public void drive(int km) {
        if((this.pass != 0) && (this.gas > 0)) {
            if(km <= gas) {
                this.km += km;
                this.gas -= km;
            } else if(km > this.gas){
                this.km += this.gas;
                System.out.println("fail: tanque vazio apos andar " + this.gas + " km");
                this.gas = 0;
            } else {
                System.out.println("fail: tanque vazio");
            }
        } else if((this.pass != 0) && (this.gas == 0)) {
            System.out.println("fail: tanque vazio");
        } else {
            System.out.println("fail: nao ha ninguem no carro");
        }
    }

    public String toString() {
        return "pass: " + this.pass + ", gas: " + this.gas + ", km: "  + this.km;   
    }
}