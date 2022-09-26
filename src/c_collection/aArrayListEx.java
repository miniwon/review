
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList result = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		
		
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		Integer	age = 31;			// int age = 31;
		Double	height = 162.3;
		
//		Object[] obj = new Object[300];
		ArrayList list = new ArrayList(2);		// 동적 배열
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
	}
}
