package basic3;

public class Ex01_함수1 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		add(a, b);

	}
	
	static void add(int a, int b) {			// static 멤버는 static 멤버만 호출할 수 있다
		// 여기에서 a, b의 값을 합해서 출력
		int sum = a + b;
		System.out.println("합: " + sum);
		
		
	}

}
