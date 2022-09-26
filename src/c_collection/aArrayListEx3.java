package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		
		ArrayList<Student> result = method();
		// 학생 정보를 여기에서 출력하시오
		for ( Student s: result) {		// 향상된 for문을 사용하려면 반드시 제네릭스 사용
			System.out.println(s);
		}
	}
	
	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길자", 25));
		list.add(new Student("홍길이", 33));
		list.add(new Student("홍삼이", 44));
		return list;
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +" 학생은 " +  age + "세 입니다.";
	}
}
