
/* Insert element in a sorted Array
 	Example: {12,16,20,40,50,70} Insert 58
 	Output:  {12,16,20,40,50,58,70} 
 	
 */
package arrays;

import java.util.*;
public class PrintSortedArray
{
	public static void main(String args[]) throws Exception
	{
		int given_number;
		int array[] = {12, 16, 20, 40, 50, 70};
		int new_array[] = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) 
		{
			new_array[i] = array[i];
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array given number : ");
		given_number = scan.nextInt();
		new_array[new_array.length - 1] = given_number;
		Arrays.sort(new_array);
		for (int i = 0; i < new_array.length; i++)
			System.out.print(new_array[i] + " ");
	}
}
