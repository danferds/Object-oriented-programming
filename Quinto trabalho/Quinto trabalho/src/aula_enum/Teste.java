package aula_enum;

public class Teste {
    public enum Dia {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;
    }

    public static void main(String[] args) {
        Dia dia = Dia.QUINTA;

        switch(dia) {
            case DOMINGO:
                System.out.println("Dia: Domingo");
                break;
            case SEGUNDA:
                System.out.println("Dia: Segunda-feira");
                break;
            case TERCA:
                System.out.println("Dia: Terça-feira");
                break;
            case QUARTA:
                System.out.println("Dia: Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Dia: Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Dia: Sexta-feira");
                break;
            case SABADO:
                System.out.println("Dia: Sábado");
                break;
                default:
        }
    }
}
