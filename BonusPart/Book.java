public class Book {

	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;

	Book() {
	}

	Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {

		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;

	}

	public void showInfo() {
		System.out.println("Book Name:" + bookName);
		System.out.println("Book Author:" + bookAuthor);
		System.out.println("Book ID:" + bookId);
		System.out.println("Book Type:" + bookType);
		System.out.println("Book Copy:" + bookCopy);
	}

	public void addBookCopy(int x) {

		x = x + bookCopy;

	}

	static int bookCounter = 0;

	static void showTotalBookInfo() {
		bookCounter++;

		System.out.println("Total Book Info:" + bookCounter);

	}

	public static void main(String args[]) {
		Book b1 = new Book("Harry Potter", "J.K Rowling", "2324", "Fantasy", 2);
		Book b2 = new Book("1984", "George Orwell", "2424", "Social-Science fiction", 4);
		b1.showInfo();
		b1.addBookCopy(5);
		b1.showTotalBookInfo();
		System.out.println();
		b2.showInfo();
		b2.addBookCopy(5);
		b2.showTotalBookInfo();
	}
}
