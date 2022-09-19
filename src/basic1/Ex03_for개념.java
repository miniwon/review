package basic1;

/*
 * 반복문: for / while / do-while
 * 
 * (1) for ( 초기값; 조건문; 증가값;) {
 * 		반복 구문
 * 	   }
 */

public class Ex03_for개념 {

	public static void main(String[] args) {
		// 1) 1부터 10까지 숫자 출력
		for ( int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// [2] 1부터 10까지의 합을 출력
		for ( int i = 1, sum = 0; i < 11; i++ ) {
			if (i < 10) {
				System.out.print(i + "+");}
			sum += i;
			if (i == 10) {
				System.out.println( i + "=" + sum);
			}
		}
		
		// [3] 1부터 10까지의 홀수의 합을 출력
		int sum1 = 0;
		for (int i = 1; i < 11; i +=2) {
			sum1 += i;
		}
		System.out.println("홀수의 합계: " + sum1);
		
		
		// [1] 위의 for 원리 이해하기
		// [2] 1부터 10까지의 합을 출력
		// [3] 1부터 10까지의 홀수의 합을 출력
		
		
		// 2) 'A'부터 'Z'까지 출력
		for ( char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		for ( char ch = 'A'; ch <= 'Z'; ch += 2) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 3) 'Z'부터 'A'까지 출력
		for ( char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(ch + " ");
		}
	}
}
