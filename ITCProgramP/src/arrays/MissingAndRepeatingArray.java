/* 	Find Missing and Repeating:
 	Example: {4,3,6,2,1,1}
 	Output: 1,5 //5 is Missing and 1 Occurs twice
 */

package arrays;

import java.util.*;

public class MissingAndRepeatingArray 
{
	public static void main(String[] args)
	{
		int arr[] = { 4, 3, 6, 2, 1, 1 };
		Map<Integer, Boolean> numberMap = new HashMap<>();
		int max = arr.length;

		for (Integer i : arr) 
		{
			if (numberMap.get(i) == null)
			{
				numberMap.put(i, true);   
			}
			else 
			{
				System.out.println("Repeating = " + i); 
			}
		}

		for (int i = 1; i <= max; i++)
		{
			if (numberMap.get(i) == null)
			{
				System.out.println("Missing = " + i);   
			}
		}
	}
}