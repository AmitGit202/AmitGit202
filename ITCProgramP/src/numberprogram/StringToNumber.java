package numberprogram;

public class StringToNumber 
{
	public static int convert_String_To_Number(String numStr) 
	{
		char ch[] = numStr.toCharArray();
		int sum = 0;
		//get ascii value for zero
		int zeroAscii = (int)'0';
		for (char c:ch) 
		{
			int tmpAscii = (int)c;
			sum = (sum*10)+(tmpAscii-zeroAscii);
		}
		return sum;
	}
	public static void main(String a[])
	{
		System.out.println("\"123\" == "+convert_String_To_Number("123"));
		System.out.println("\"3546\" == "+convert_String_To_Number("3546"));
		System.out.println("\"3\" == "+convert_String_To_Number("3"));
	}
}