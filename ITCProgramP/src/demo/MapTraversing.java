package demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTraversing 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		System.out.println(hm);

		Set<Integer> s =hm.keySet();
		System.out.println(s);

		Collection<String> c=hm.values();
		System.out.println(c);

		Set<Entry<Integer, String>> s1 =hm.entrySet();
		System.out.println(s1);

		Iterator<Entry<Integer, String>> itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m1  =itr.next();

			System.out.println(m1.getKey() + " " + m1.getValue());

		}
	}

}
