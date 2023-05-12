package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    @Override
    public String toString(){
        return "Product data: "
                + name
                + ", $ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units"
                + "Total: $ "
                +  String.format("%.2f",totalValueInStock());
    }
}
