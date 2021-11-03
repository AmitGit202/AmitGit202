package gridHubAndNodeTesting;


public class JavaLongestStringInStringArray
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
		String[] array = {"to","toes","toe","dog","dogs","book","banana"};
		String longestString = getLongestString(array);
		System.out.format("longest string: '%s'\n", longestString);
	}

}



