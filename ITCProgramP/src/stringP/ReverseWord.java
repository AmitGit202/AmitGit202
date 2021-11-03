package stringP;

public class ReverseWord 
{
		public static String reverse(String s)
		{
			String r ="";
			String s1[] = s.split(" ");
			for(int i=s1.length-1; i>=0;i--)
			{
				r = r+ " " +s1[i];
			}
			return r;
		}
		public static void main(String[] args) 
		{
			String s ="Hello tell me you are";
			//String r = reverse(s);
			System.out.println(reverse(s));

		}
	}



