package basic4;

import java.util.Scanner;

public class CalculatorTest_2 {

	public static void main(String[] args) {
		CalculatorExpr c1 = new CalculatorExpr();

		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		do {
			System.out.println("계산할 숫자 2개를 입력해 주세요 >>>");
			
			c1.setNum1(sc.nextInt());
			c1.setNum2(sc.nextInt());
			sc.nextLine();
			
			if (count > 0) System.out.println("추출된 숫자 : " + c1.getNum1() + ", " + c1.getNum2());
			System.out.println("덧셈 : " + c1.getAddition());
			System.out.println("뺄셈 : " + c1.getSubtraction());
			System.out.println("곱셈 : " + c1.getMultiplication());
			System.out.println("나눗셈 : " + c1.getDivision());

			System.out.println("계속 진행하시겠습니까? Yes면 Y, No면 N을 입력해 주세요 >>>");
			count++;
		} while (sc.nextLine().equalsIgnoreCase("Y")); 

		System.out.println("프로그램이 종료되었습니다");
		sc.close();
	}

}
