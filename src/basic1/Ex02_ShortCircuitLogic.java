package basic1;

public class Ex02_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		
		if (a > 3 && ++a > 3) {
			System.out.println("조건 만족");	// X
		}
		System.out.println("a = " + a); 	// 3

		if (a > 1 || ++a > 3) {
			System.out.println("조건 만족2");	// O
		}
		System.out.println("a = " + a); 	// 3
		
	}

}
