package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics<> 지정 -> 입력할 자료형을 명확히 지정
		
		list.set(3, "rat");
		System.out.println(list);
		
		list.remove(1);				// 하나를 제거하니까 뒤에 있는 번호들이 앞으로 당겨짐
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		//System.out.println(list); 		// [] 대괄호는 배열을 의미
		for (int i = 0; i < list.size(); i++) {
			String data = (String)list.get(i);		// get 함수는 무조건 object형으로 리턴, 형변환으로 원하는 값으로 변경 필요
			System.out.println(data);
		}
		
		// 향상된 for문
		for ( String data: list ) {
			System.out.print(data + " ");
		}
		System.out.println();

	}
}
