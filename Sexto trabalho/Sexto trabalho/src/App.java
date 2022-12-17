import java.lang.Math;


public class App {
    public static void main(String[] args) throws Exception {
        double g = 6.67300E-11;
        double m = 5.976e+24;
        double r = 6.37814e6;
        
        double resultado = (g * m) / Math.pow(r, 2);

        System.out.println(resultado);
    }
}
