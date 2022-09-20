package basic2;

import java.util.Scanner;

public class Ex03_369응용_입출력2 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("369 게임을 진행할 수를 입력하세요");
	int num = sc.nextInt();
	if (num < 1 || num > 100000) {
		System.out.println("1 이상 100,000 이하인 자연수만 입력하세요");
		return;
	}
	
	int count = 0;
	for (int i = 1; i <= num; i++) {
		
		int su = i;
		boolean su369 = false;
		while (su != 0) {
			int na = su % 10;
			
			if (na == 3 || na == 6 || na == 9) {
				su369 = true;
				count++;
				break;
			}
			su = su /10;
		}
		
		if (i == 3) System.out.print(i); 
		else if (su369) System.out.print(", " + i);
		
}
	System.out.println("에 숫자 3, 6, 9가 포함되어 총 " + count + "회 손뼉을 칩니다");

}
}
