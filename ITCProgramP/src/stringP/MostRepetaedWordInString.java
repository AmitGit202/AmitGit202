/*
 	Second most repeated string in a sequence
	Example: {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"}
	Output: “bbb”
 */
package stringP;

import java.util.*;
public class MostRepetaedWordInString 
{
	public static void main(String args[]) 
	{
		String str[] = {"aaa","ccc","ccc","bbb","bbb","aaa","bbb","ccc","aaa"};
		int len = 0;
		len = str.length;
		Set<String> st = new HashSet<>();
		for(int k =0; k<len; k++)
		{
			st.add(str[k]);
		}
		TreeMap<Integer, String> map = new TreeMap<>();
		for(int i=1;i<=st.size();i++)
		{
			int count = 0;
			for(int j=1; j<len;j++)
			{
				if(str[i].equals(str[j]))
					count++;  
			}
			String str1 = str[i];
			map.put(count, str1);}
		//    map.pollLastEntry();
		System.out.println("The Second repetitive string "+map.get(map.lastKey()));
	}
}

