package zero_cancelar;
import java.util.*;

public class ComputaSequencia {
    private ArrayList<Integer> valores;

    public ComputaSequencia() {
        this.valores = new ArrayList<Integer>();
    }

    public void cadastra(int valor) {
        if(valor == 0) {
            this.valores.remove(valores.size() - 1);
        } else {
            this.valores.add(valor);
        }
    }

    public int computa() {
        int somaValores = 0;

        for(int i = 0; i < valores.size(); i++) {
            somaValores += valores.get(i);
        }

        return somaValores;
    }

    public String toString() {
        String retorno = "valores = [";

        for(int i = 0; i <valores.size(); i++) {
            if(i == 0) {
                retorno += String.format("%d", valores.get(i));
            } else {
                retorno += String.format(", %d", valores.get(i));
            }
        }

        retorno += "]";

        return retorno;
    }
}