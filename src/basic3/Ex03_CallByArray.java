package basic3;

import java.util.Arrays;

public class Ex03_CallByArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 3};
		arrChange(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	static void arrChange(int[] a) {
		
		a[0] = 10;
		a[1] = 40;
		System.out.println(Arrays.toString(a));
	}
	
}
