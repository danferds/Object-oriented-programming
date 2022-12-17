package gerencia_figurinhas;

public class Circulo extends Shape {
    private Ponto2D centro;
    private double raio;

    public Circulo(Ponto2D centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto2D getCentro() {
        return this.centro;
    }

    public double getRaio() {
        return this.raio;
    }

    public double area() {
        return (Math.PI * (getRaio() * getRaio()));
    }

    public double perimeter() {
        return 2 * Math.PI * getRaio();
    }

    boolean inside(Ponto2D p) {
        return centro.distancia(p) <= getRaio();
    }

    public String toString() {
        return String.format("Círculo com centro em %s e raio %.1f", getCentro(), getRaio());
    }
}