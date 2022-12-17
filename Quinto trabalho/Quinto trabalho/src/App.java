//import teste.Lapiseira;
import grafite.*;
//import teste.Grafite;

public class App {
    public static void main(String[] args) {
        Pencil l = new Pencil(0.5f);   
        
        //Lapiseira lap = new Lapiseira(0.5f);

        //lap.inserir(new Grafite(0.5f, "2B", 50));
    
        l.insert(new Lead(0.5f, "2B", 50));

        System.out.println(l);
    }
}

/*
 * public class Solver {

    static Pencil lap = new Pencil(0.5f);
    public static void main(String[] args) {
        chain.put("init",   () -> lap = new Pencil(Float.parseFloat(ui.get(1))));
        chain.put("insert", () -> lap.insert(new Lead(Float.parseFloat(ui.get(1)), ui.get(2), Integer.parseInt(ui.get(3)))));
        chain.put("remove", () -> lap.remove());
        chain.put("write",  () -> lap.writePage());
        chain.put("show",   () -> System.out.println(lap.toString()));

        execute(chain, ui);
    }

    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Runnable> chain = new HashMap<>();
    static ArrayList<String> ui = new ArrayList<>();

    static void execute(HashMap<String, Runnable> chain , ArrayList<String> ui) {
        while(true) {
            ui.clear();
            String line = scanner.nextLine();
            Collections.addAll(ui, line.split(" "));
            System.out.println("$" + line);
            if(ui.get(0).equals("end")) {
                break;
            } else if (chain.containsKey(ui.get(0))) {
                chain.get(ui.get(0)).run();
            } else {
                System.out.println("fail: comando invalido");
            }
        }
    }
}

 */