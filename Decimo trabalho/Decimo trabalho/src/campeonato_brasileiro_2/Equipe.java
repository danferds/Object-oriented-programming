package campeonato_brasileiro_2;

public class Equipe {
    private String nome;
    private int totalPontos, totalVitorias, saldoGols, golsPro;

    public Equipe(String nome, int totalPontos, int totalVitorias, int saldoGols, int golsPro) {
        this.nome = nome;
        this.totalPontos = totalPontos;
        this.totalVitorias = totalVitorias;
        this.saldoGols = saldoGols;
        this.golsPro = golsPro;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    public String toString() {
        return String.format("Equipe [nome=%s," + " totalPontos=%d," + " totalVitorias=%d," + " saldoGols=%d," + " golsPro=%d]"
        ,getNome(), getTotalPontos(), getTotalVitorias(), getSaldoGols(), getGolsPro());

    }
}
