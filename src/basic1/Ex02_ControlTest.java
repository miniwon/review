package basic1;

import java.util.Scanner;

public class Ex02_ControlTest {

	public static void main(String[] args) {
		
		System.out.println("학번을 입력하세요 ->");
		
		Scanner input = new Scanner(System.in);
		String studentID = input.next();
		
		String year = studentID.substring(0,4);
		char coll = studentID.charAt(4);
		
		String major = studentID.substring(5,7);
		
		String printColl = null;
		String printMajor = null;
		
		// 스위치문을 이용하면 가장 깔끔하지 않을까?
		switch (coll) {
		case '1': printColl = "공대";			// java는 타입에 예민하다 char를 썼다면 '1', String을 썼다면 "12" 따옴표 잘 체크
			switch (major) {
			case "11": printMajor = "컴퓨터학과"; break;
			case "12": printMajor = "소프트웨어학과"; break;
			case "13": printMajor = "모바일학과"; break;
			case "22": printMajor = "자바학과"; break;
			case "33": printMajor = "서버학과"; break;}
			break;
		case '2': printColl = "사회대";
			switch (major) {
			case "11": printMajor = "사회학과"; break;
			case "12": printMajor = "경영학과"; break;
			case "13": printMajor = "경제학과"; break; }
			break;
		}
		System.out.println(studentID + " 는 " + year + "년도에 입학한 " + printColl + " " + printMajor + " 학생입니다");
		
		
		/* 첫 번째 방법을 조금 더 깔끔하게 할 수 없나?
		if (coll == '1') { printColl = "공대";
			if (major.equals("11")) { printMajor = "컴퓨터학과"; }
			if (major.equals("12")) { printMajor = "소프트웨어학과"; }
			if (major.equals("13")) { printMajor = "모바일학과"; }
			if (major.equals("22")) { printMajor = "자바학과"; }
			if (major.equals("33")) { printMajor = "서버학과"; }
		}
		if (coll == '2') { printColl = "사회대";
			if (major.equals("11")) { printMajor = "사회학과"; }
			if (major.equals("12")) { printMajor = "경영학과"; }
			if (major.equals("13")) { printMajor = "경제학과"; }
		}
		*/
	
		
		/* 첫 번째 방법
		System.out.print(studentID + " 는 " + year + "년도에 입학한 ");
		
		
		if (coll.equals("1")) {
			System.out.print("공대 ");
			if (major.equals("11")) { System.out.print("컴퓨터학과"); }
			if (major.equals("12")) { System.out.print("소프트웨어학과"); }
			if (major.equals("13")) { System.out.print("모바일학과"); }
			if (major.equals("22")) { System.out.print("자바학과"); }
			if (major.equals("33")) { System.out.print("서버학과"); }
		}
		if (coll.equals("2")) {
			System.out.print("사회대 ");
			if (major.equals("11")) { System.out.print("사회학과"); }
			if (major.equals("12")) { System.out.print("경영학과"); }
			if (major.equals("13")) { System.out.print("경제학과"); }
		}
		System.out.println(" 학생입니다");
		*/
	}
}
