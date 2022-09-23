package zfinal;

class Parent {

	String field = "부모님 것";

	public void jib() {
		System.out.println("부모님이 만드신 것");
	}

}

class Child extends Parent {
	Child() {
		field = "내 것";
	}

	public void jib() {
		System.out.println("내가 집문서 담보로 도박을 함");
	}
}

	public class Test {

		public static void main(String[] args) {
			Parent p = new Child();
			System.out.println(p.field);
			p.jib();
		}


	}