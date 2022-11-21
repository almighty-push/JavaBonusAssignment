public class Library extends Account {
	protected String libname;
	protected String libAddress;
	protected Book[] Book;
	protected int totalBook;
	protected int totalPayment = 0;
	protected Student[] students = new Student[100];

	Library() {
	}

	public Library(String libname, String libAddress, int totalBook, int size) {
		this.libname = libname;
		this.libAddress = libAddress;
		this.totalBook = totalBook;
		this.Book = new Book[size];

	}

	public void addNewBook(Book book) {
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
	}

	public void showAllBookInfo() {
		for (int i = 0; i < Book.length; i++) {
			if (Book[i] != null) {
				System.out.println("Book ID:" + Book[i].bookId);
				Book[i].showInfo();
				System.out.println();
			}
		}
	}

	Book searchBook(int id) {
		for (int i = 0; i < Book.length; i++) {
			if (Book[i] != null) {
				if (Book[i].bookId == id) {
					return Book[i];
				}
			}
		}
		return null;
	}

	public void addStudentToLog(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	void showAllStudentInfo() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("------------------");
				System.out.println("Student ID:" + students[i].id);
				students[i].showInfo();
				System.out.println("Borrowed Books --->");
				students[i].showAllBookInfo();
				System.out.println();
			}
		}
	}

}