package basic1;

//import java.lang.String;

public class Ex01_Var {
	
	/*
	 *  멤버 변수
	 *  
	 *  자료형(data type)
	 *  1. 기본 자료형
	 *  	- boolean
	 *  	- char
	 *  	- byte / short / int / long
	 *  	- double / float
	 *  
	 *  2. 참조 자료형
	 *  	- 클래스
	 *  	- 배열
	 *  	=> new 예약어를 통해 객체를 생성
	 *  	(*) String
	 */
	
	String a;
	int b;

	public static void main(String[] args) {
		// 지역 변수
		String a;		// 문자열 변수 a 선언
		int b;			// 정수 변수 b 선언
		
		// 변수 a에 "Hello" 문자열 지정
		a = "Hello";
		// a = new String("Hello");
		
		// 변수 b에 200 대입
		b = 200;
		
		// 변수 a와 b를 콘솔에 출력
		System.out.println(a);
		System.out.println(b);
	

	}

}
