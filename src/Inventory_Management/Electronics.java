package Inventory_Management;

public class Electronics extends Item{
    int warranty;
    Electronics(int warranty,int price,int quantity,String id,String name){
        super(id,name,price,quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
