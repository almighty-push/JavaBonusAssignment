public class Library extends Account {
	protected String libname;
	protected String libAddress;
	protected Book[] Book;
	protected int totalBook;
	protected int totalPayment = 0;

	Library() {
	}

	public Library(String libname, String libAddress, int totalBook, int size) {
		this.libname = libname;
		this.libAddress = libAddress;
		this.totalBook = totalBook;
		this.Book = new Book[size];

	}

	public void AddNewBook(Book book) {
		boolean flag = false;
		for (int i = 0; i < Book.length; i++) {
			if (Book[i] == null) {

				Book[i] = book;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Add new book successful .");
		} else {
			System.out.println("Add book failed ");
		}
	}

	public void AddNewBookCopy(Book book, int copy) {
		for (int i = 0; i < copy; i++) {
			for (int j = 0; j < Book.length; j++) {
				if (Book[j] == null) {
					Book[j] = book;
					break;

				}

			}

		}
		System.out.println("Added New Book Copy");
	}

	public void showLibInfo() {

		System.out.println("Library Name:" + libname);
		System.out.println("Library Address:" + libAddress);
		System.out.println("Total Books:" + totalBook);
		System.out.println("Total Payment:" + totalPayment);
		Book book = new Book();
		book.showTotalBookInfo();

	}

}