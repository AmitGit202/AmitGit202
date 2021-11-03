package demo;

public class Demo 
{
	public static void main(String[] args) 
	{
		String s="Amit";
		String ls=s.toLowerCase();
		System.out.println(ls);
		char ss[]= ls.toCharArray();
		for(int i=ss.length-1;i>=0;i--)
		{
			System.out.println(ls.charAt(i));
		}
		
	}

}
