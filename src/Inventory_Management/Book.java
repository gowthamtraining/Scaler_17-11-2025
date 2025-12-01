package Inventory_Management;

public class Book extends Item {
    String author;
    Book(String author,int price,int quantity,String id,String name){
        super(id,name,price,quantity);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
