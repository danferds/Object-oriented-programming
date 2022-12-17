import java.util.LinkedList;

public class Mercantil {
   
    Pessoa caixas[];
    private LinkedList<Pessoa> filaEspera;

    Mercantil(int qtdCaixas){
        caixas = new Pessoa[qtdCaixas];
        filaEspera = new LinkedList<Pessoa>();
    }

    public void chegar(Pessoa p){
       filaEspera.add(p);
    }

    public boolean chamarNoCaixa(int indice){
        boolean auxiliar = true;

        if(filaEspera.isEmpty()) {
            System.out.println("fail: fila vazia");
            auxiliar = false;
        } else {
            for(int i = 0; i < caixas.length; i++) {
                if(caixas[i] == null) {
                    caixas[indice] = filaEspera.getFirst();
                    auxiliar = true;
                } else {
                    auxiliar = false;
                }
            }

            filaEspera.remove();
        } 

        return auxiliar;
    }

    public Pessoa finalizarAtendimento(int indice){
        Pessoa auxiliar = caixas[indice];
        caixas[indice] = null;

        return auxiliar;
    }

    public String toString(){
        String retorno = "|";

        for(int i = 0; i < caixas.length; i++) {
            if(caixas[i] == null) {
                retorno += i + ":-----|";
            } else {
                retorno += i + ":" + caixas[i] + "|";
            }
        } 

        retorno += "\n";

        if(filaEspera == null) {
            retorno += "Espera: []";
        } else {
            retorno += "Espera: [";

            
            for(int i = 0; i < filaEspera.size(); i++) {
                retorno += filaEspera.get(i);

                if(i != filaEspera.size() - 1) {
                    retorno += ", ";
                }
            }

            retorno += "]";
        }

        return retorno;
    }
}