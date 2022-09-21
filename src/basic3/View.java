package basic3;

public class View {

	static int method( int z,int x) {
	     int sum = z + x;
	     System.out.println("sum = " +  sum );
	     return sum;
	}
	
	public static void main ( String  [] args ) {
	     int a = 4,  b = 2;
	     int sum = 0;
	     sum = method( a, b );
	     System.out.println("sum = " +  sum );
	}
	}
