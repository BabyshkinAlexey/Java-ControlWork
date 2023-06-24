import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ToyStore 
{
    File file = new File("Data.txt");
    public ArrayList<Toy> toys;
    Scanner scan = new Scanner(System.in);

    public void addToys() 
    {
        System.out.print("Придумайте ID товара: ");
        int id = scan.nextInt();
        System.out.print("Введите название товара: ");
        String name = scan.next();
        System.out.print("Введите количество товара: ");
        int quantity = scan.nextInt();
        scan.close();

        Toy toy = new Toy(id, name, quantity);
        toys.add(toy);
        
        try 
        {
            FileWriter writer = new FileWriter(file, true);
            writer.write(toy.getId() + "    " + toy.getName() + "    " + toy.getQuantity() + "\n");
            writer.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Ошибка при записи в файл игрушки");
        }
    }   
    

    public ToyStore() 
    {
        toys = new ArrayList<Toy>();
    }

    public void allToys()
    {
        System.out.println("\n");
        try(FileReader reader = new FileReader(file))
        {
            int c;
            while((c=reader.read())!=-1)
            {
                System.out.print((char)c);
            } 
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }   
    }

    public void serchId()
    {
        // System.out.print("Введите id: ");
        // int idnum = scan.nextInt();
        System.out.print(toys);
    }
}
