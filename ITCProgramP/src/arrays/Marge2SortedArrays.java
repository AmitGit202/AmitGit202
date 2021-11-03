
/*	Merge Two Sorted Arrays:
  	Example:{5,8,9} {4,7,8}
  	Output: {4,5,7,8,8,9}
 */
package arrays;

import java.util.*;
public class Marge2SortedArrays
{
	public static void main(String args[]) 
	{
		int arr[] = {5,8,9};
		int arr1[] = {4,7,8};
		int len = 0;
		len = arr.length;
		List<Integer> li = new ArrayList<>();
		for(int i=0;i<len;i++)
		{
			li.add(arr[i]); 
		}
		for(int i=0;i<len;i++) 
		{
			li.add(arr1[i]);
		}
		Collections.sort(li);
		System.out.println("The Merge Two Sorted Arrays "+li);
	}
}
