package calculando_peso;

import java.lang.Math;

enum Planeta {
    MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6), MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7), SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7), NEPTUNE (1.024e+26, 2.4746e7);

    private final double mass;   // in kilograms
    private final double radius; // in meters

    Planeta(double mass, double radius) {
       this.mass = mass;
       this.radius = radius;
    }
    
    public static final double G = 6.67300E-11;

    double forcaGravitacional() {
        return (G * mass) / Math.pow(radius, 2);
    }

    double pesoSuperficie(double otherMass) {
        return otherMass * forcaGravitacional();
    }
}
  
class Pessoa {
    private String nome;
    private double mass;
    private Planeta p;
  
    public Pessoa(String nome, double mass, Planeta p){
      this.nome = nome;
      this.mass = mass;
      this.p = p;
    }
  
    public double massaEquivalente(Planeta otherPlanet) {
        double gravidadeTerra = 9.802652743337129;
        double massaEquival = otherPlanet.pesoSuperficie(this.mass) / gravidadeTerra;

        String mensagem = "A forca gravitacional no planeta " + otherPlanet + " é " + 
        String.format("%.2f", otherPlanet.forcaGravitacional());

        System.out.println(mensagem);

        return massaEquival;

    }
  
    public String toString() {
       return "nome: " + this.nome + " mass: " + String.format("%.2f", this.mass) + " planeta: " + this.p;
    }
}