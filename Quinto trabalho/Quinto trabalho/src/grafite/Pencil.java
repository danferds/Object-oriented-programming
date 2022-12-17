package grafite;

public class Pencil {
    private float thickness;
    private Lead tip;

    public Pencil(float thickness) {
        this.thickness = thickness;
    }

    public float getThickness() {
        return this.thickness;
    } 

    public void setThickness(float value) {
        this.thickness = value;
    } 

    public boolean hasGrafite() {
        return (this.tip != null);
    }

    public boolean insert(Lead grafite) {
        if(this.hasGrafite()) {
            System.out.println("fail: ja existe grafite");
            return false;
        }

        if(grafite.getThickness() == this.thickness) {
     
            this.tip = grafite;
            return true;
        } else {
            System.out.println("fail: calibre incompatível");
            return false;
        }
    }

    public Lead remove() {
        return this.tip = null;
    }

    public void writePage() {

        int TAMANHO_MIN = 10;
        int SIZE = this.tip.getSize();

        if(SIZE <= 10){

            System.out.println("warning: grafite com tamanho insuficiente para escrever");

        } else {

            int desgaste = this.tip.usagePerSheet();

            if(SIZE < desgaste){

                System.out.println("fail: folha incompleta");
                this.tip.setSize(10);

            } else {
                this.tip.setSize(SIZE - desgaste);

            }
        }
         
    }

    public String toString() {
        String saida = "calibre: " + thickness + ", grafite: ";
        if (tip != null)
            saida += "[" + tip + "]";
        else
            saida += "null";

        return saida;
    }
}
