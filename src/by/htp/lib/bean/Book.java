package by.htp.lib.bean;

public class Book {

	private int id;
	private String title;
	private int year;
	private Author author;

	public Book() {
		super();
	}

	public Book(int id, String title, int year) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
	}

	public Book(int id, String title, int year, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book id=" + id + ", title=" + title + ", year=" + year + ", author=" + author + "";
	}

}
