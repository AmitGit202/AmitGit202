package demo;

import java.util.Comparator;
import java.util.TreeMap;

public class CutomizeSorting 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t = new TreeMap<Integer,String>(new MyComparator());
		
		t.put(1, "aaa");
		t.put(2, "bbb");
		t.put(3, "ccc");
		t.put(4, "ddd");
		
		System.out.println(t);
		
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
		
	}
}