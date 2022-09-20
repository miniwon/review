package basic2;

import java.util.Scanner;

/*
 * for			: 반복 횟수가 정해진 경우
 * while		: 반복 횟수를 모르는 경우
 * do-while		: 반복 횟수를 모르는 경우(조건을 나중에 비교)
 */

public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력하세요
		Scanner input = new Scanner(System.in);

		// 1. for문
		System.out.println("몇 번 반복할까요?");
		int repeat1 = input.nextInt();

		System.out.println("=====for문=====");
		for (int s = 1; s <= repeat1; s++) {
			System.out.println("구구단의 단수를 입력하세요 >>>");
			int i = input.nextInt();
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}

		// 2. while문
		System.out.println("=====while문=====");
		int j = 1;
		System.out.println("구구단의 단수를 입력하세요 >>>");
		int i = input.nextInt();
		while (j < 10) {
			System.out.print(i + " * " + j + " = " + i * j + "\t");
			j++;
		}
		System.out.println();

		// 2-1. while문 응용
		System.out.println("=====while문 응용=====");
		while (true) {
			System.out.println("구구단 중 원하는 단수를 입력하세요");
			int n = input.nextInt();
			for (int m = 1; m <= 9; m++) {
				System.out.print(n + " * " + m + " = " + n * m + "\t");
			}
			System.out.println();
			System.out.println("반복을 종료하려면 Y를 입력하세요");
			String answer = input.next();
			if (answer.equalsIgnoreCase("Y"))
				break;
		}

		// 3. do-while문
		System.out.println("=====do-while문=====");
		int j1 = 1;
		System.out.println("구구단의 단수를 입력하세요 >>>");
		int i1 = input.nextInt();
		do {
			System.out.print(i1 + " * " + j1 + " = " + i1 * j1 + "\t");
			j1++;
		} while (j1 < 10);
		System.out.println();

		// 3-1. do-while문 응용
		do {
			System.out.println("구구단 중 원하는 단수를 입력하세요");
			int n = input.nextInt();
			for (int m = 1; m <= 9; m++) {
				System.out.print(n + " * " + m + " = " + n * m + "\t");
			}
			System.out.println();
			System.out.println("반복을 종료(Y)");
			String answer = input.next();
			if (answer.equalsIgnoreCase("Y"))
				break;
		} while (true);
	}

}
