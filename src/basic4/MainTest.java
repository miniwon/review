package basic4;

public class MainTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		// 값 지정 1 - setter
		s1.setName("홍길동");
		s1.setKor(100);
		s1.setEng(30);
		s1.setMath(55);
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 30;
//		s.math = 55;
		
		
		// 값 지정 2 - 생성자
		Student s2 = new Student("홍길자", 99, 88, 66);
		s2.calTotal();
		s2.calAvg();
		s2.ouput();
		
		

	}

}
