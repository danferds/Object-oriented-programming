package conta_bancaria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault ( Locale.US ) ;
        
        ArrayList<Conta> contas = new ArrayList<Conta>();

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);

            if(ui[0].equals("init")) {
                contas.add( new Conta( ui[1] ) );
            } else if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("deposita")) {
                int nro = Integer.parseInt(ui[1] );
                double valor = Double.parseDouble(ui[2]);
                Conta.deposita( contas.get(nro),  valor); 
            }else if(ui[0].equals("saca")) {
                int nro = Integer.parseInt(ui[1] );
                double valor = Double.parseDouble(ui[2]);
                Conta.saca( contas.get(nro),  valor); 
            }else if(ui[0].equals("transfere")) {
                int origem = Integer.parseInt(ui[1] );
                int destino = Integer.parseInt(ui[2] );
                double valor = Double.parseDouble(ui[3]);
                Conta.transfere( contas.get(origem), contas.get(destino), valor); 
            } else if(ui[0].equals("show")) {
                int i = Integer.parseInt(ui[1] );
                System.out.println( contas.get(i) ); 
            } else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}
