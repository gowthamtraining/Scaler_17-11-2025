package Inventory_Management;

public class Clothing extends Item {
    int size;

    Clothing(int size,int price,int quantity,String id,String name){
        super(id,name,price,quantity);
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
