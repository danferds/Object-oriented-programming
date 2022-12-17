//import junk_food.Slot;
import junk_food.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine machine = new VendingMachine(3);

        /*machine.setSlot(0, new Slot("todinho", 2, 4));
        machine.setSlot(1, new Slot("suco de larnaja", 3, 2));
        machine.setSlot(2, new Slot("coxinha", 6, 3.50));
         
        System.out.println(machine.toString());
        machine.clearSlot(0);*/
        System.out.println(machine.toString());
    }
}