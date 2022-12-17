package empresa;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Empresa empresa = new Empresa();

        Empregado e = new Empregado("Daniel", 60, 40.00);
        
        empresa.adicionaEmpregado(e);

        Empregado s = new Empregado("Nicole", 35, 100.00);

        Terceirizado t = new Terceirizado("Luiza", 40, 50.00, 100.00);

        empresa.adicionaEmpregado(s);
        empresa.adicionaEmpregado(t);

        empresa.mostraEmpregado();

        System.out.println("------------------------");
        System.out.println("Folha sálarial: " + empresa.calculaFolha());
        System.out.println("------------------------");



    }
}
