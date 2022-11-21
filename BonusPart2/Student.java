public class Student extends Account {

    String name;
    String id;
    int due;
    protected Book[] books = new Book[5];

    Student() {
    }

    Student(String name, String id, String accName, String acid, int balance) {
        super(accName, acid, balance);
        this.name = name;
        this.id = id;
    }

    void deposit(int amount) {
        super.deposit(amount);
    }

    void transfer(int amount, Account receiver) {
        super.transfer(amount, receiver);
    }

    int addPayment(int day, boolean reason) {
        if (reason) {
            due = due + (day * 10) / 2;
        } else {
            due = due + (day * 10);
        }
        return due;
    }

    public void borrowBook(Book book, Library lib) {
        boolean flag = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                lib.addStudentToLog(this);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Borrowing failed, you can not borrow more than 5 books");
        }
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Account Name: " + accName);
        System.out.println("Account ID: " + acid);
        System.out.println("Balance: " + balance);
    }

    // print all borrowed book
    void showAllBookInfo() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].showInfo();
            }
        }
    }

}
