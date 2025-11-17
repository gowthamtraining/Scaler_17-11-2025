public class Member extends User{
    int borrowedBooksCount;
    final int MAX_BORROW_LIMIT = 5;
    void displayDashboard(){
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed:" + borrowedBooksCount);
    }
    boolean canBorrowBooks(){
        return borrowedBooksCount<MAX_BORROW_LIMIT;
    }
    Member(int borrowedBooksCount){
        this.borrowedBooksCount = borrowedBooksCount;
    }

}
