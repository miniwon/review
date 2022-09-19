package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
		
		// 기본 틀
		System.out.println("=====A to Z 26 번 반복=====");
		for (int i = 0; i < 26; i++ ) {
			for ( char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		// [문제 1]
		System.out.println("=====문제 1=====");
		for (int i = 0; i < 26; i++) {	
			for ( char ch = 'A'; ch <= 'A'+i ; ch++ ) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		// [문제2]
		System.out.println("=====문제 2=====");
		for (int i = 25; i >= 0; i--) {	
			for ( char ch = 'A'; ch <= 'A'+i ; ch++ ) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		// [문제 3]
		System.out.println("=====문제 3=====");
		for (int i = 0; i < 26; i++) {	
			for ( char ch = (char)('A' + i); ch <= 'Z' ; ch++ ) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		// [문제 4]
		System.out.println("=====문제 4=====");
		for (int i = 25; i >= 0; i--) {	
			for ( char ch = 'Z'; ch >= 'A'+i ; ch-- ) {
				System.out.print(ch);
			}
			System.out.println();
			}
		
		// [문제 5]
		System.out.println("=====문제 5=====");
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for ( char ch = (char)('A' + i); ch <= 'Z' ; ch++ ) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}
