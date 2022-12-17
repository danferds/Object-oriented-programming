package calculator;

public class Calculator {
    private int batteryMax;
    private int battery;
    private float display;

    /**
     * Inicializa os atributos.
     * @param batteryMax - Capacidade máxima da bateria.
     */
    public Calculator(int batteryMax) {
        this.batteryMax = batteryMax;
        this.battery = 0;
        this.display =  0;
    }

    /**
     * Recarrega a bateria. Caso a bateria ultrapasse
     * sua capacidade máxima, sua carga será igualada a capacidade máxima.
     * @param value - Valor de recarga da bateria.
     */
    public void chargeBattery(int value) {
        this.battery += value;

        if(this.battery > this.batteryMax)
            this.battery = this.batteryMax;
    } 

    /**
     * Consume uma unidade da bateria caso ela tenha carga a maior que 0.
     * @return true caso tenha bateria suficiente, false caso contrário.
     */
    public boolean useBattery() {
        if(this.battery > 0) {
            this.battery--;
            return true;
        } else
            return false;
    } 

    /**
     * Realiza soma entre dois números caso haja bateria suficiente.
     * @param a - Primeiro número da soma.
     * @param b - Segundo número da soma.
     */
    public void sum(int a, int b) {
        if(useBattery())
            this.display = (float) a + b;
        else
            System.out.println("fail: bateria insuficiente");
    } 

    /**
     * Realiza subtração entre dois números caso haja bateria suficiente.
     * @param a - Primeiro número da subtração.
     * @param b - Segundo número da subtração.
     */
    public void subtract(int a, int b) {
        if(useBattery())
            this.display = a - b;
        else
            System.out.println("fail: bateria insuficiente");
    }

    /**
     * Realiza subtração entre dois números caso haja bateria suficiente.
     * @param a - Primeiro número da subtração.
     * @param b - Segundo número da subtração.
     */
    public void multiply(int a, int b) {
        if(useBattery())
            display = a * b;
        else 
            System.out.println("fail: bateria insuficiente");
    }

    /**
     * Realiza divisão entre dois números caso haja bateria suficiente.
     * @param a - Primeiro número da divisão.
     * @param b - Segundo número da divisão.
     */
    public void division(int a, int b){
        if(useBattery() && b != 0)
            this.display = a / b;
        else if(b == 0)
            System.out.println("fail: divisao por zero");
        else
            System.out.println("fail: bateria insuficiente");
    }

    public String toString() {
        return "display = " + String.format("%.2f", display)
            + ", battery = " + String.format("%d", battery);
    }
}