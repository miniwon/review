package basic3;

public class MethodTest03 {

	static void multiple(int a, int b) {
		System.out.println(a*b);
	}

	static void multiple(int a, char b) {

		for(int i = 0; i < a; i++) {
			System.out.print(b);
		}
		
		/*		char[] arr = new char[a];
		for (int i = 0; i < a; i++) {
			arr[i] = b;
		}
		String str = new String(arr);
		System.out.println(str);
		*/		
	}

	static void multiple(int a, int b, char c) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		multiple(7,11);
		multiple(7,'큭');
		System.out.println();
		multiple(5, 6, '힛');

	}

}
