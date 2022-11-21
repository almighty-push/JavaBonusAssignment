public class Account {
    protected String accName;
    protected String acid;
    protected int balance;

    Account() {
    };

    Account(String accName, String acid, int balance) {
        this.accName = accName;
        this.acid = acid;
        this.balance = balance;
    }

    void deposit(int amount) {
        amount = amount + balance;
    }

    void Witdraw(int amount) {
        amount = amount - balance;
    }

    void transfer(int amount, Account receiver) {
        balance -= amount;
        receiver.balance = receiver.balance + amount;
    }
}
