public class Toy 
{
    private int id;              
    private String name;              
    private int quantity;              
    private int weight_factor;          
    
    
    // public Toy(int id, String name, int quantity, int weight_factor) 
    // {
    //     this.id = id;
    //     this.name = name;
    //     this.quantity = quantity;
    //     this.weight_factor = weight_factor;
    // }
    public Toy(int id, String name, int quantity) 
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight_factor() {
        return weight_factor;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setWeight_factor(int weight_factor){
        this.weight_factor = weight_factor;
    }
    
}