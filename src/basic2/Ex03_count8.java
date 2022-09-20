package basic2;

/*
 * [문제] 8의 개수 세기(구글 입사 문제)
 * 
 * 1부터 10,000까지 8이라는 숫자가 총 몇 번 나오는가?
 * 8이 포함되어 있는 숫자의 개수를 카운팅하는 것이 아니라 8이라는 숫자를 모두 카운팅해야 한다
 * (ex. 8808은 3, 8888은 4로 카운팅)
 * 
 */

public class Ex03_count8 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <=10000; i++) {
			int su = i;
			while (su != 0) {
				int na = su % 10;
				if (na == 8) { count++; }
				su = su / 10;
			}
		}
		System.out.println("1부터 10,000까지 8이라는 숫자는 총 <<" + count + ">>번 나온다");	
	}
}
