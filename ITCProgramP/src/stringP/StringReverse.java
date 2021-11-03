package stringP;

public class StringReverse
{
	public static String reverse(String s)
	{
		String r ="";
		for(int i=s.length()-1; i>=0;i--)
		{
			r = r+s.charAt(i);
		}
		return r;
	}
	public static void main(String[] args) 
	{
		String s ="Hello";
		String r = reverse(s);
		System.out.println(r);

	}
}
