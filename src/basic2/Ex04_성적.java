package basic2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] kor = new int[5];
		
		for (int i = 0; i < kor.length; i++) {
			System.out.println(i + "번 학생의 국어 점수를 입력 ->");
			kor[i] = input.nextInt();
		}
		
		System.out.println(Arrays.toString(kor));
		
		// 출력
		for (int i = 0; i < kor.length; i++) {
			System.out.println(i + "번 학생의 국어 점수: " + kor[i]);
		}
		
		// 위 학생들 점수의 총점과 평균을 출력
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < kor.length; i++) {
			sum += kor[i];
			count++;
		}
		
		
		System.out.println("학생들의 국어 점수의 합계: " + sum);
		System.out.println("학생들의 국어 점수의 평균: " + (double)sum/count);
		
		
	}

}
