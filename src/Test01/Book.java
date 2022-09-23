package Test01;

public class Book {

	String name;
	String author;
	String publisher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	Book(String name, String author, String publisher) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

}
