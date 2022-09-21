package basic3;

public class Ex01_함수3 {
	
	public static void main(String[] args) {
	
		int[] result = add();
		// a와 b 값을 받아서 합한 결과를 여기에서 출력
		
		// 배열 방의 개수를 알 때
		int sum1 = result[0] + result[1];
		System.out.println("합계: " + sum1);
		
		// 배열 방의 개수를 모를 때
		int sum2 = 0;
		for(int i = 0; i < result.length; i++) {
			sum2 += result[i];
		}
		System.out.println("합계: " + sum2);
		
	}
	
	static int[] add() {
		int a = 10, b = 20;
		int[] arr = { a, b };
		
		return arr;
	}
	
}
