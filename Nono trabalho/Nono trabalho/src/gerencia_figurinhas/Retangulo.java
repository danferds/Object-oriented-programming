package gerencia_figurinhas;

public class Retangulo extends Shape {
    private Ponto2D inEsq;
    private Ponto2D subDir;

    public Retangulo(Ponto2D inEsq, Ponto2D subDir) {
        this.inEsq = inEsq;
        this.subDir = subDir;
    }

    public Ponto2D getInEsq() {
        return this.inEsq;
    }

    public Ponto2D getSubDir() {
        return this.subDir;
    }

    public double area() {
        return ((getSubDir().x - getInEsq().x) * (getSubDir().y - getInEsq().y));
    }

    double perimeter() {
        return 2 * ((getSubDir().x - getInEsq().x) + (getSubDir().y - getInEsq().y));
    }

    boolean inside(Ponto2D p) {
        return (p.y <= getSubDir().y && p.y >= getInEsq().y) && (p.x >= getInEsq().x && p.x <= getSubDir().x);
    }

   @Override
    public String toString() {
        return String.format("Retângulo com cantos %s e %s", getInEsq(), getSubDir());
    }
}