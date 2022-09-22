package basic.temp.test;

import java.awt.Frame;

public class Test1 {
	
	Frame f;
	
	Test1() {
		
		f = new Frame("교촌치킨 먹고 싶다");
		
	}
	
	void addLayout() {
		f.setBounds(100, 100, 300, 260);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.addLayout();
	}

}
