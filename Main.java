import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        PrizeGame prizeGame = new PrizeGame();

        ui ui = new ui();
        Scanner scan = new Scanner(System.in);
        ui.interfacee();
        int n = scan.nextInt();

        // Начальный список
        prizeGame.addToy(new Toy(1, "Кубик-рубика", 5.0));
        prizeGame.addToy(new Toy(2, "Кукла", 45.0));
        prizeGame.addToy(new Toy(3, "Машинка", 60.0));
        prizeGame.addToy(new Toy(4, "Мячик", 10.0));
        int id = 5;

        while (n != 0)
        {
            if (n == 1)
            {
                System.out.print("Введите название товара: ");
                String name = scan.next();
                System.out.print("Введите вес товара: ");
                int weight = scan.nextInt();
                prizeGame.addToy(new Toy(id, name, weight)); 
                id += 1;
            }

            else if (n == 2)
            {
                System.out.println(prizeGame.getToys());
                System.out.print("Введите ID товара для изменения: ");
                int idnum = scan.nextInt();
                System.out.print("Введите необходимый вес: ");
                int mass = scan.nextInt();
                Toy x = prizeGame.getToys().get(idnum - 1);
                prizeGame.changeToyWeight(x, mass);
            }

            else if (n == 3) System.out.println(prizeGame.getToys());

            else if (n == 4) 
            {
                    Toy prizeToy = prizeGame.choosePrizeToy();
                    System.out.println("Призовая игрушка: " + prizeToy);
                    System.out.println("Оставшиеся игрушки: ");
                    System.out.println(prizeGame.getToys());
            }
            else System.out.println(" \n Введите номер команды от 0 до 4");

            System.out.println();
            ui.interfacee();
            n = scan.nextInt();
        }
        scan.close();
    }
}