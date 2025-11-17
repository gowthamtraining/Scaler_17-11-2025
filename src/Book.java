public abstract class Book implements Lendable {
    String isbn;
    String title;
    String author;
    boolean isAvailable;
    boolean lend(User user){
        return user.canBorrowBooks();
    }

    @Override
    public void returnBook(User user) {
        this.isAvailable = true;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    abstract void displayBookDetails();
}
