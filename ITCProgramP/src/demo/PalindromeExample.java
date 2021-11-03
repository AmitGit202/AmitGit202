package demo;

import java.util.Scanner;

class PalindromeExample{  
	public static void main(String args[])
	{  
		String  reverse = ""; // Objects of String class  
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = in.nextLine();   
		String original="amit";
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome: " + reverse);  
	      else  
	         System.out.println("Entered string/number isn't a palindrome: " + reverse);   
	}  
}  


