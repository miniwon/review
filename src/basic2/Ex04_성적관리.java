package basic2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적관리 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 1. 사람 수 받아서 배열의 행 개수 만들기
		System.out.println("성적을 입력할 학생 수를 입력하세요 >>>");
		int numberPeople = input.nextInt();
		System.out.println();
		System.out.println(numberPeople + "명의 국어, 영어, 수학 점수를 받아 결과 출력하기");
		System.out.println();

		int[][] scores = new int[numberPeople][3];
		input.nextLine(); // 얘가 없으면 nextInt() 입력 후 엔터를 뒤에서 인식해서 1번째 학생의 성적이 입력되지 않는다

		// 2. 국어/영어/수학 점수를 인풋받아 2차원 배열에 넣기
		for (int i = 0; i < scores.length; i++) { // scores.length 대신 numberPeople 해도 같은 의미
			System.out.print(i + 1 + "번째 학생의 국어/영어/수학 성적을 입력 -> ");
			String inputScores = input.nextLine();
			StringTokenizer st = new StringTokenizer(inputScores, "/");
			for (int j = 0; st.hasMoreTokens(); j++) {
				String str = st.nextToken();
				scores[i][j] = Integer.parseInt(str);
			}
		}
		System.out.println();
		System.out.println("[결과]");

		// 3. 개인별 총점과 평균 만들기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(i + 1 + "번째 학생의 총점은 " + sum + "점이고, 평균은 " + sum / 3.0 + "점입니다");
		}
		System.out.println("\n----------------------------------");

		// 4. 과목별 총점과 평균 만들기
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		for (int i = 0; i < scores.length; i++) {
			korScore += scores[i][0];
			engScore += scores[i][1];
			mathScore += scores[i][2];
		}

		System.out.println("국어 과목 총점은 " + korScore + "점이고, 평균은 " + korScore / (double) scores.length + "점입니다");
		System.out.println("영어 과목 총점은 " + engScore + "점이고, 평균은 " + engScore / (double) scores.length + "점입니다");
		System.out.println("수학 과목 총점은 " + mathScore + "점이고, 평균은 " + mathScore / (double) scores.length + "점입니다");

		input.close();
	}

}
