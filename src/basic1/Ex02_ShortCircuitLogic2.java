package basic1;

public class Ex02_ShortCircuitLogic2 {

	public static void main(String[] args) {
		
		int a = 3;
		
		if(a > 3 & ++a > 3) {
			System.out.println("조건 만족");	// X
		}
		System.out.println("a = " + a);		//4
		
		if(a > 1 | ++a > 3) {
			System.out.println("조건 만족2");	// OO
		}
		System.out.println("a = " + a);		//5
	}

}
