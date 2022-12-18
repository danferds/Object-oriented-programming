public class App {
    public static void main(String[] args) throws Exception {
        Mercantil mer = new Mercantil(2);
        Pessoa p = new Pessoa("Daniel");
        Pessoa p2 = new Pessoa("Nicole");
        Pessoa p3 = new Pessoa("Júlia");

        mer.chegar(p);
        mer.chegar(p2);
        mer.chegar(p3);
        mer.chamarNoCaixa(0);

        System.out.println(mer.toString());
    }
}