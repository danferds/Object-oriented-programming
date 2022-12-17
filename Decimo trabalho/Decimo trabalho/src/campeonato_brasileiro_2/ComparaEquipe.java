package campeonato_brasileiro_2;

import java.util.Comparator;

class ComparaEquipe implements Comparator<Equipe> {
    public int compare(Equipe t1, Equipe t2) {
        int retorno = 0;

        if(t1.getTotalPontos() != t2.getTotalPontos()) {
            if(t1.getTotalPontos() < t2.getTotalPontos()) {
                retorno = 1; // Aaa
            } else {
                if(t1.getTotalPontos() > t2.getTotalPontos()) {
                    retorno = -1;
                } else  {
                    retorno = 0;
                }
            }
        } else {
            if(t1.getTotalVitorias() != t2.getTotalVitorias()) {
                if(t1.getTotalVitorias() < t2.getTotalVitorias()) {
                    retorno = 1;
                } else {
                    if(t1.getTotalVitorias() > t2.getTotalVitorias()) {
                        retorno = -1;
                    } else {
                        retorno = 0;
                    }
                }
            } else {
                if(t1.getSaldoGols() != t2.getSaldoGols()) {
                    if(t1.getSaldoGols() < t2.getSaldoGols()) {
                        retorno = 1;
                    } else {
                        if(t1.getSaldoGols() > t2.getSaldoGols()) {
                            retorno = -1;
                        } else {
                            retorno = 0;
                        }
                    }
                } else {
                    if(t1.getGolsPro() != t2.getGolsPro()) {
                        if(t1.getGolsPro() < t2.getGolsPro()) {
                            retorno = 1;
                        } else {
                            if(t1.getGolsPro() > t2.getGolsPro()) {
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
}