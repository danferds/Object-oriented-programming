package media_notas;

import java.util.*;

public class MediaNotas{

    private ArrayList<Double> notas;

    public MediaNotas() {
        this.notas = new ArrayList<Double>();
    }

    public void addNota(double nota){
        this.notas.add(nota);
    }

    public void removeNota(int index){
        if(index >= 0 && index < notas.size())
            this.notas.remove(index);
        else
            System.out.println("falha: indice invalido");
    }

    public void mudaNota(int index, double valor){
            notas.set(index, valor);
    }

    public double maiorNota(){
        double maiorNota = notas.get(0);

        if(notas.size() > 0) {
            for(double nota : notas) {
                if(nota > maiorNota) {
                    maiorNota = nota;
                }
            }
        } else
            System.out.println("falha: quantidade de notas insuficiente");

        return maiorNota;
    }

    public double menorNota(){
        double menorNota = notas.get(0);

        if(notas.size() > 0) {
            for(double nota : notas) {
                if(nota < menorNota) {
                    menorNota = nota;
                }
            }
        } else
            System.out.println("falha: quantidade de notas insuficiente");

        return menorNota;
    } 

    public double media(){
        double media = 0.0;

        for (double nota : notas) {
            media += nota / notas.size();
        }

        return media;
    }

    public void parametriza() {
        for(int i = 0; i < notas.size(); i++) {
            if(notas.get(i) != maiorNota()) 
                mudaNota(i, (notas.get(i) / maiorNota()) * 10);
        }

        for(int i = 0; i < notas.size(); i++) {
            if(notas.get(i) == maiorNota())
                mudaNota(i, maiorNota() / maiorNota() * 10);
        } 
    }

    public String toString() {  
        String retorno = "[";

        for(int i = 0; i <notas.size(); i++) {
            if(i == 0)
                retorno += String.format("%.2f", notas.get(i));
            else
                retorno += String.format(", %.2f", notas.get(i));
        }

        retorno += "]";

        return retorno;
    }
}
