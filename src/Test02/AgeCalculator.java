package Test02;

import java.util.Calendar;

public class AgeCalculator {

	public static void main(String[] args) {
		int year;
		year = 1996;
		
		int age;
		
		Calendar today = Calendar.getInstance();
		age = today.get(Calendar.YEAR) - year;
		
		System.out.println("태어난 년도: " + year);
		System.out.println("나의 나이: " + age);

	}

}
