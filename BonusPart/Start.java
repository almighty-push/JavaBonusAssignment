import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Student s1 = new Student("Rahim", "123", "Rahim-Student-Account", "123", 1000);
            Library lib = new Library("AIUB Library", "Kuratoli", 10000, 100);

            System.out.println("~~~~~~Welcome to AIUB Library~~~~~~~~~");
            System.out.println("New Student Account Created for " + s1.name);
            System.out.println("New Library Account Created for " + lib.libname);
            System.out.println("\nStudent INFO:");
            s1.showInfo();
            System.out.println("\nLibrary INFO:");
            lib.showLibInfo();
            System.out.println();
            while (true) {
                System.out.println("--------------------------------------");
                System.out.println("1. Deposit book after due pass?");
                System.out.println("2. Pay Due fee");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                System.out.println("--------------------------------------");

                if (choice == 1) {
                    System.out.print("1. How manay days pass? :");
                    int days = input.nextInt();
                    System.out.println("You have to pay 10 taka per day");
                    System.out.println("1. Student Has any valid reason");
                    System.out.println("2. Student Has NO valid reason ");
                    System.out.print("Enter your choice: ");
                    int reason = input.nextInt();
                    if (reason == 1) {
                        System.out.println("Pertial payment accepted");
                        System.out.println("You have to pay " + s1.addPayment(days, true) + " taka");
                    } else if (reason == 2) {
                        System.out.println("You have to pay " + s1.addPayment(days, false) + " taka");
                    }
                    System.out.println("Total Fine: " + s1.due);
                } else if (choice == 2) {
                    System.out.println("Total Fine: " + s1.due);
                    System.out.print("1. How much you want to pay? : ");
                    int pay = input.nextInt();
                    s1.transfer(pay, lib);
                    System.out.println("\nNew Student Balance: " + s1.balance);
                    System.out.println("Remaining Fine: " + s1.due);
                    System.out.println("\nNew Library Balance: " + lib.balance);
                } else if (choice == 3) {
                    System.out.println("Thank you for using our service");
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }
        }
    }

}
