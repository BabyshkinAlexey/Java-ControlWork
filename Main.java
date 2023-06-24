
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        ui ui = new ui();
        ToyStore store = new ToyStore();
        Scanner scan = new Scanner(System.in);
        
        ui.interfacee();
        int n = scan.nextInt();
        
        if (n == 1) store.allToys();
        else if (n == 2) store.addToys();
        else if (n == 3) store.serchId();
        else if (n == 4) {}
        else System.out.println("error");
        scan.close();
        
    }
}