package gerencia_figurinhas;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
    abstract boolean inside(Ponto2D p);
    public abstract String toString();
}