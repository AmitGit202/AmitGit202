package stringP;


public class StringDuplicateWord 
{  
	public static void main(String[] args) 
	{    
		String string = "Big black bug bit a big black dog on his big black nose";    
		int count;      
		string = string.toLowerCase();    

		//Split the string into words using built-in function    
		String words[] = string.split(" ");    

		System.out.println("Duplicate words in a given string : ");     
		for(int i = 0; i < words.length; i++) 
		{    
			count = 1;    
			for(int j = i+1; j < words.length; j++) 
			{    
				if(words[i].equals(words[j])) 
				{    
					count++;    
				 
				}    
			}    

			//Displays the duplicate word if count is greater than 1    
			if(count > 1)    
				System.out.println(words[i]);    
		}    
	}    
}    


