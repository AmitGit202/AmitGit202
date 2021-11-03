/*
 	Run length encoding:
	Given a string, find the number of occurrences of each character in that string.
	For e.g. aaabbccd        	Output: a3b2c2d1
	Input "aaabbcaadddeeee" 	Output: "a3b2c1a2d3e4"
*/

package stringP;

public class FrequencyOfChar 
{
	public static void main(String[] args)  
	{    
		//String str = "aaabbcaadddeeee jhhhjhj";
		String str = "ppicture perfect";
		    
		int[] freq = new int[str.length()];    
		int i, j;        
		//Converts given string into character array    
		char string[] = str.toCharArray();         
		for(i = 0; i<str.length(); i++) {    
			freq[i] = 1;    
			for(j = i+1; j<str.length(); j++) 
			{    
				if(string[i] == string[j])      
				{    
					freq[i]++;                          
				}  
			}
		}        
		//Displays the each character and their corresponding frequency    
		System.out.println("Characters and their corresponding frequencies");    
		for(i = 0; i <freq.length; i++)  
		{    
			if(string[i] != ' ')   
				System.out.print(string[i] + "=" + freq[i]+",");   
				 
		}
	}
}  