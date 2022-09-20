package basic2;

public class Ex01_while개념 {

	public static void main(String[] args) {
		
		// 0. for문 (1~10)
		int sum = 0;
		for ( int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		// 초기값을 반복 블록 위로
		// 증가값을 반복문 끝으로
		// 조건문만 남아서 for -> while
		
		int sum1 = 0;
		int i = 1;
		while (i <= 10) {
			sum1 += i;
			i++;
		}
		System.out.println(sum1);
		
		// 2. do-while
		int sum2 = 0;
		int j = 1;
		do {
			sum2 += j;
			j++;
		} while (j <=10 );
		System.out.println(sum2);
	}

}
