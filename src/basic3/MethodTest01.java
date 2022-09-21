package basic3;

import java.util.Scanner;

public class MethodTest01 {

	static boolean checkLower(char alphb) {

		if (alphb >= 'a' && alphb <= 'z')
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("검사할 영문자를 입력하세요");

		char alphb = sc.next().charAt(0);

		System.out.println(checkLower(alphb));
	}

	/*	지선 풀이
	 * 	static boolean checkLower(char c) {
			return Character.isLowerCase(c);
		}
	 */
	
}

