package Inventory_Management;

public class Item implements Comparable<Item> {
    @Override

    String id;
    String name;
    int price;
    int quantity;

    Item(String id,String name,int price,int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public int compareTo(Item o) {
        return o.price-this.price;
    }

}
