package basic3;

public class Ex03_CallByValue {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		add(a, b);
		System.out.println("A = " + a + ", B = " + b); // a = 10, b = 20
	}
	
	static void add(int a, int b) {			// = 대입연산자의 의미 => 스택 메모리 값의 복사
		a += b;
		System.out.println("A = " + a + ", B = " + b); // a = 30, b = 20
		
	}

}
