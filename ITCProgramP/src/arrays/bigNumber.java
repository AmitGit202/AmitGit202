
/*		Arrange given numbers to form the biggest number
		Example: {1, 34, 3, 98, 9, 76, 45, 4}
		Output: 998764543431

 */
package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class bigNumber
{
	public static void main(String[] args)
	{
		List<Integer> listOfNumbers = Arrays.asList(1, 34, 3, 98, 9, 76,45,4);  
		System.out.println(listOfNumbers);
		Collections.sort(listOfNumbers, new MyComparator());
		System.out.println("Biggest number is:-");
		// Biggest number
		for(Integer i : listOfNumbers)
		{
			System.out.print(i);
		}
	}	
}
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i, Integer j) 
	{
		String str1 = i.toString() + j.toString();
		
		String str2 = j.toString() + i.toString();
		
		return str2.compareTo(str1);
	}
}
//Output: 998764543431
