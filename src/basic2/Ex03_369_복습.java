package basic2;

public class Ex03_369_복습 {
	/*
	 * [문제]
	 * 
	 * 1부터 50까지 숫자 중에서 3, 6, 9 숫자가 포함되면
	 * 그 개수만큼 '짝' 글자를 출력하고
	 * 그렇지 않으면 그 숫자를 출력
	 * 
	 * ex) 26				123
	 * 		6 ->			  3 ->
	 * 		2 ->			  2 ->
	 */

	public static void main(String[] args) {

		for ( int i = 1; i <= 50; i++ ) {

			int su = i;
			boolean not369 = false;

			while ( su != 0 ) {
				int na = su % 10;
				if ( na == 3 || na == 6 || na == 9 ) {
					System.out.print("짝");
					not369 = true;
				}
				su = su / 10;
			}

			if (not369) System.out.println();
			else System.out.println(i);

		}

	}

}
