package poly;


public class Book extends Item {
	

	private String author = "";
	private String publisher = "";
	
	public Book() {
		this("000","제목없음","무명","출판사");
		System.out.println("기본 생성자");
	}
	
	public Book(String num, String name,String author, String publisher) {
//		super.num = num;
//		super.name = name;
		super(num, name);
		this.author = author;
		this.publisher = publisher;
		System.out.println("인자 생성자");
	}

	
	public void output() {
		System.out.println("번호: " + num);
		System.out.println("제목: " + name);
		System.out.println("작가: " + author);
		System.out.println("출판사: " + publisher);
	}
}
