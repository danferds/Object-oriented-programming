package empresa;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private ArrayList<Empregado> empregados;

    Empresa() {
        empregados = new ArrayList<>();
    }

    public void adicionaEmpregado(Empregado e){
        empregados.add(e);
    }

    public void mostraEmpregado(){
        for(Empregado empregado : empregados) {
            System.out.println(empregado.toString());
        }

    }

    public double calculaFolha(){
        double folhaSalarial = 0.0;

        for(Empregado empregado : empregados) {
            folhaSalarial += empregado.pagamento();
        }

        return folhaSalarial;
    }
}