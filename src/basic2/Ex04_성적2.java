package basic2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] kor = new int[3];
		
		/*
		 * 3명의 국어 점수를 입력하세요 (ex. 10/20/30)
		 */
		System.out.println(kor.length + "명의 국어 점수를 입력하세요(ex. 10/20/30)");
		String inputData = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputData, "/");
		
		for(int i = 0; st.hasMoreTokens(); i++) {		// hasMoreTokens(): 남은 토큰이 있으면 true, 없으면 false를 반환하는 메서드
			String str = st.nextToken();				// nextToken()	  : 객체에서 다음 토큰을 반환
			kor[i] = Integer.parseInt(str);
		}
		
		/*
		for (int i = 0; i < kor.length; i++) {
			System.out.println(i + "번 학생의 국어 점수를 입력 ->");
			kor[i] = input.nextInt();
		}
		*/
		
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
