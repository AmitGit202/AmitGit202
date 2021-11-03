package demo;


public class ArrayDesecnding
{
	//	// A sample Java program to sort an array of integers
	//	// using Arrays.sort(). It by default sorts in
	//	// ascending order
	//
	//		public static void main(String[] args)
	//		{
	//			// Our arr contains 8 elements
	//			int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
	//
	//			Arrays.sort(arr);
	//
	//			System.out.printf("Modified arr[] : %s",
	//							Arrays.toString(arr));
	//		}
	//	}


	public static void main(String args[])
	{

		int i,j,temp;

		int[] a= {3,2,5,1};

		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				//if(a[i]>a[j])//Asecending Order formula
				if(a[i]<a[j])//Desecending Order formula
				{
					temp=a[i]; 
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements sorted in descending  order are");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	} 
}