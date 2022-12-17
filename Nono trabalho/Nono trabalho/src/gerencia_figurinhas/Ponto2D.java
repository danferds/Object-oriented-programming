package gerencia_figurinhas;

public class Ponto2D {
    public double x;
    public double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto2D h) {
        double distancia_x = x - h.x;
        double distancia_y = y - h.y;

        return Math.sqrt(distancia_x * distancia_x + distancia_y * distancia_y);
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", x, y);
    }
}