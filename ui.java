public class ui 
{
    ToyStore store = new ToyStore();

    public void interfacee()
    {
        System.out.print("""
                Ведите номер операции:
                    1 - просмотр данных по товару
                    2 - добавление товара
                    3 - вычесление шанса выйгрыша определенного товара по ID
                    4 - сыграть в лотырею 
                =====>""");
    }

}
