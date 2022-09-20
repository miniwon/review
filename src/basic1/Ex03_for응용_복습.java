package basic1;

public class Ex03_for응용_복습 {

	public static void main(String[] args) {

		// [문제1]
		System.out.println("=====문제 1=====");
		for (int i = 0; i < 26; i++) {
			for (char alphb = 'A'; alphb <= 'A' + i; alphb++) {
				System.out.print(alphb);
			}
			System.out.println();
		}
		System.out.println();

		// [문제2]
		System.out.println("=====문제 2=====");
		for (int i = 0; i < 26; i++) {
			for (char alphb = 'A'; alphb <= 'Z' - i; alphb++) {
				System.out.print(alphb);
			}
			System.out.println();
		}
		System.out.println();

		// [문제3]
		System.out.println("=====문제 3=====");
		for (int i = 0; i < 26; i++) {
			for (char alphb = (char) ('A' + i); alphb <= 'Z'; alphb++) {
				System.out.print(alphb);
			}
			System.out.println();
		}
		System.out.println();

		// [문제4]
		System.out.println("=====문제 4=====");
		for (int i = 0; i < 26; i++) {
			for (char alphb = 'Z'; alphb >= 'Z' - i; alphb--) {
				System.out.print(alphb);
			}
			System.out.println();
		}
		System.out.println();

		// [문제5]
		System.out.println("=====문제 5=====");
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (char alphb = (char) ('A' + i); alphb <= 'Z'; alphb++) {
				System.out.print(alphb);
			}
			System.out.println();
		}
		System.out.println();
	}

}
