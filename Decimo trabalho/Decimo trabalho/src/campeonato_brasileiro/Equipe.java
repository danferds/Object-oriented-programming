package campeonato_brasileiro;

import java.lang.Comparable;

public class Equipe  implements Comparable<Equipe> {
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

    public int compareTo(Equipe other) {
        int retorno = 0;

        if(other.getTotalPontos() != getTotalPontos()) {
            if(other.getTotalPontos() > getTotalPontos()) {
                retorno = 1;
            } else {
                if(other.getTotalPontos() < getTotalPontos()) {
                    retorno = -1;
                } else  {
                    retorno = 0;
                }
            }
        } else {
            if(other.getTotalVitorias() != getTotalVitorias()) {
                if(other.getTotalVitorias() > getTotalVitorias()) {
                    retorno = 1;
                } else {
                    if(other.getTotalVitorias() < getTotalVitorias()) {
                        retorno = -1;
                    } else {
                        retorno = 0;
                    }
                }
            } else {
                if(other.getSaldoGols() != getSaldoGols()) {
                    if(other.getSaldoGols() > getSaldoGols()) {
                        retorno = 1;
                    } else {
                        if(other.getSaldoGols() < getSaldoGols()) {
                            retorno = -1;
                        } else {
                            retorno = 0;
                        }
                    }
                } else {
                    if(other.getGolsPro() != getGolsPro()) {
                        if(other.getGolsPro() > getGolsPro()) {
                            retorno = 1;
                        } else {
                            if(other.getGolsPro() < getGolsPro()) {
                                retorno = -1;
                            } else {
                                retorno = 0;
                            }
                        }
                    } else {
                        System.out.println("Informações insuficientes");
                    }
                }
            }
        }

        return retorno;
    } 

    public String toString() {
        return String.format("Equipe [nome=%s," + " totalPontos=%d," + " totalVitorias=%d," + " saldoGols=%d," + " golsPro=%d]"
        ,getNome(), getTotalPontos(), getTotalVitorias(), getSaldoGols(), getGolsPro());

    }
}