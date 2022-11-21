public class Student extends Account {

    String name;
    String id;
    int due;

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
        due -= amount;
    }

    int addPayment(int day, boolean reason) {
        if (reason) {
            due = due + (day * 10) / 2;
        } else {
            due = due + (day * 10);
        }
        return due;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Account Name: " + accName);
        System.out.println("Account ID: " + acid);
        System.out.println("Balance: " + balance);
    }

}
