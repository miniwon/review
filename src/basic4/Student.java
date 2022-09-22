package basic4;

public class Student {
	
	public Student () {
//		this.name = "이름 없음";
//		this.kor = 50;
//		this.eng = 50;
//		this.math = 50;
		this("이름 없음", 50, 50, 50);
		System.out.println("기본 생성자");
		
	}
	public Student (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	private String hakbun;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public void calTotal () {
		total = kor + eng + math;
	}
	public void calAvg() {
		avg = total / 3.0;
	}
	public void ouput() {
		System.out.println(name+"님의 성적: " + total + " / " + avg);
	}

	/*
	 *  캡슐화
	 *   - 멤버 변수(field): private
	 *   - 멤버 메서드: public
	 */
	
}


