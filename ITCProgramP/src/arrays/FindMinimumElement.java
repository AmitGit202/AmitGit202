
/*	Find Minimum element in a sorted and rotated array	*/

package arrays;

public class FindMinimumElement
{
	public static int findMin(int[] a)
	{
		int min = a[a.length-1];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
				break;
			}

		}

		return min;
	}

	public static void main(String[] args) 
	{
		int a[] = {4,5,6,7,7,8,9,2,3,1};
		System.out.println(findMin(a));

	}

}
