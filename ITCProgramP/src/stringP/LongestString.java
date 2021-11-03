/*
 	find the longest string which is available in the given dictionary 
	dic = ['to','toes','toe','dog','dogs','book','banana']
 */
package stringP;
class LongestString

{
	public static String getLongestString(String[] array) 
	{
		int maxLength = 0;
		String longestString = null;
		for (String s : array)
		{
			if (s.length() > maxLength) 
			{
				maxLength = s.length();
				longestString = s;
			}
		}
		return longestString;
	}
	public static void main(String[] args)
	{
		String[] strings = {"to","toes","toe","dog","dogs","book","banana"};
		String longestString = getLongestString(strings);

/*		for (int i=0; i<strings.length; i++) 
		{
			 System.out.print(strings[i]);
			 System.out.println();
		}
*/	
		System.out.println("Longest string: " + longestString);

	}

}
