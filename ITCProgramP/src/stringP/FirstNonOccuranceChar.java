package stringP;

public class FirstNonOccuranceChar 
{
	public static void test(String s)
	{
		int i =0;
		char[] cahrArrayob = s.toCharArray();
		for(i=0; i<cahrArrayob.length; i++)
		{
			int c =0;
			for(int j =0; j<cahrArrayob.length;j++)
			{
				if(cahrArrayob[i]==cahrArrayob[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println("First Non repeating characters in the given String is:" + cahrArrayob[i]);
				break;
			}
		}
		if(i==cahrArrayob.length)
		{
			System.out.println("All characters are repeated, No unique characters found");
		}
		
	}
	
	public static void main(String[] args) 
	{
		String s ="bcebgcfef";
		test(s);
				
		
	}

}
