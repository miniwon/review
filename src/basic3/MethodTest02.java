package basic3;

import java.util.Scanner;

public class MethodTest02 {
	
	static char checkUpper (char alphb) {
		
		if (alphb >= 'a' && alphb <= 'z') {
			alphb = Character.toUpperCase(alphb);
			return alphb;
		}
		else return alphb;
	
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검사할 영문자를 입력하세요");
		
		char alphb = sc.next().charAt(0);
		
		System.out.println(checkUpper(alphb));
	}
	
/*	지선 씨 풀이
 * 	static char checkUpper(char c) {
		return Character.toUpperCase(c);
	}
 */
}
