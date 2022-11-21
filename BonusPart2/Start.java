import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Student s1 = new Student("Rahim", "123", "Rahim-Student-Account", "123", 1000);
            Library lib = new Library("AIUB Library", "Kuratoli", 10000, 100);

            // add somebooks
            Book b1 = new Book("Harry Potter", "J.K Rowling", 1, "Fantasy", 2);
            Book b2 = new Book("1984", "George Orwell", 2, "Social-Science fiction", 4);
            Book b3 = new Book("The Alchemist", "Paulo Coelho", 3, "Adventure", 3);
            Book b4 = new Book("The Kite Runner", "Khaled Hosseini", 4, "Adventure", 2);
            Book b5 = new Book("The Da Vinci Code", "Dan Brown", 5, "Adventure", 1);
            // added them to library
            lib.addNewBook(b1);
            lib.addNewBook(b2);
            lib.addNewBook(b3);
            lib.addNewBook(b4);
            lib.addNewBook(b5);

            System.out.println();
            System.out.println("~~~~~~Welcome to AIUB Library~~~~~~~~~");
            System.out.println();
            lib.showAllBookInfo();
            System.out.println();
            while (true) {
                System.out.println("--------------------------------------");
                System.out.println("1. Borrow Book");
                System.out.println("2. Show all borrowed books by student");
                System.out.println("3. Show all student info From Library");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                System.out.println("--------------------------------------");

                if (choice == 1) {
                    System.out.println("Enter the ID you want to borrow: ");
                    int id = input.nextInt();
                    Book book = lib.searchBook(id);

                    s1.borrowBook(book, lib);

                    System.out.println();
                } else if (choice == 2) {
                    System.out.println("All borrowed books by student " + s1.name + ": ");
                    s1.showAllBookInfo();
                    System.out.println();
                } else if (choice == 3) {
                    System.out.println("All student info From Library: ");
                    lib.showAllStudentInfo();
                    System.out.println();
                } else if (choice == 4) {
                    System.out.println("Thank you for using our service");
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }
        }
    }

}
