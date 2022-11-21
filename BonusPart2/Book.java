public class Book {

	protected String bookName;
	protected String bookAuthor;
	protected int bookId;
	protected String bookType;
	protected int bookCopy;

	Book() {
	}

	Book(String bookName, String bookAuthor, int bookId, String bookType, int bookCopy) {

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
}
