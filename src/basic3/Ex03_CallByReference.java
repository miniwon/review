package basic3;

public class Ex03_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer i = new StringBuffer("안녕");
		StringBuffer j = new StringBuffer("하이");
		
		add(i, j);
		System.out.println("A = " + i + ", B = " + j); // a = 안녕하이, b = 하이
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("A = " + a + ", B = " + b); // a = 안녕하이, b = 하이
	}

}

/*
	문자열 처리 클래스
	
	 - String

	 - StringBuffer / StringBuilder

*/