package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		set.add("elephant");
		set.add("fox");
		set.add("rabbit");
		set.add("zebra");
		set.add("zebra");
		set.add("elephant");	
		set.add("fox");
		set.add("fox");
		set.add("fox");
		
		System.out.println( set );		
	}
}
