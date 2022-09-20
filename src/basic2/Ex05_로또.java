package basic2;

import java.util.Arrays;

public class Ex05_로또 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		// 값 지정
		for(int i = 0; i <lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
		}
		
		// 버블 정렬
		for( int i = lotto.length-1 ; i >0 ; i--) {		// i는 5, 4, 3, 2, 1
			for( int j = 0; j < i; j++) {				// i가 5일 때 j는 0, 1, 2, 3, 4 / i가 4일 때 j는 0, 1, 2, 3
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		/*
		 * int a = 5, b = 10;
		 * int temp;
		 * temp = a;
		 * a = b;
		 * b = temp;
		 */
		
		// 번호 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		/*
		 * Math.random(): 0.0 <= 소수점수 < 1.0: 0~1 사이의 숫자를 랜덤으로 뽑아서 반환
		 * 	ex) 0.1234
		 * 		0.00123
		 * 		0.5673
		 * 		0.9999
		 * 
		 * Math.random() * 10
		 *  ex) 0.1234	* 10 -> 1.234
		 *  	0.00123 * 10 -> 0.0123
		 *  	0.5673	* 10 -> 5.673
		 *  	0.9999	* 10 -> 9.999
		 *  
		 * (int)(Math.random() * 10)
		 *  ex) 0.1234	* 10 -> 1.234	=> 1
		 *  	0.00123 * 10 -> 0.0123	=> 0
		 *  	0.5673	* 10 -> 5.673	=> 5
		 *  	0.9999	* 10 -> 9.999	=> 9
		 */
		
		
		
		
		
		
		/*
		 int[] lotto = { 3, 42, 5, 20, 25, 39 };
		 
		
		// 번호 출력
		System.out.println(Arrays.toString(lotto));
		
		*/
		
	}

}
