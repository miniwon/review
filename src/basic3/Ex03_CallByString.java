package basic3;

public class Ex03_CallByString {

	public static void main(String[] args) {
	
		String i = new String("안녕");
		String j = new String("하이");
		
		add(i, j);
		System.out.println("A = " + i + ", B = " + j); // a = 안녕, b = 하이
	}
	
	static void add(String a, String b) {
		a += b;
		System.out.println("A = " + a + ", B = " + b); // a = 안녕하이, b = 하이
	}

}

/*
	문자열 처리 클래스
	
	 - String

	 - StringBuffer / StringBuilder

*/