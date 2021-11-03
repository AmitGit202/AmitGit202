
/* 	Find the Dot Product of 2 Array		*/

package arrays;

public class DotProduct 
{
	public static void main(String[] args)
	{
		int arr[] = {2,3,4,5};
		int arr1[] = {1,2,3,4};
		int len =0;
		len = arr.length;
		int dotproduct =0;

		for(int i=0;i<len;i++)
		{
			dotproduct += (arr[i]*arr1[i]);
		}

		System.out.println("Dot Product: " + dotproduct);

	}

}
