public abstract class User {

    // 🔹 Step 6.1: Static counter shared by all users
    private static int totalUsers = 0;

    protected int userId;
    protected String name;
    protected String contactInfo;

    // ---- Setters ----
    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // ---- Constructors ----

    // Default constructor
    User() {
        this.userId = generateUniqueId();
        this.name = null;
        this.contactInfo = null;
    }

    // Parameterized constructor
    User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Copy constructor
    User(User copyUser) {
        this.userId = copyUser.userId;
        this.name = copyUser.name;
        this.contactInfo = copyUser.contactInfo;
    }

    // ---- Step 6.2: Unique ID generator ----
    // 🔒 final → cannot be overridden by subclasses
    protected final int generateUniqueId() {
        return ++totalUsers;   // increments and returns unique ID
    }

    // ---- Step 6.1: Method to get total user count ----
    public static int getTotalUsers() {
        return totalUsers;
    }

    // ---- Abstract Methods ----
    abstract void displayDashboard();
    abstract boolean canBorrowBooks();
}
