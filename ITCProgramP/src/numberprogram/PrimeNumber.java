package numberprogram;


public class PrimeNumber  
{  
	public static void main(String[] args)   
	{  
		int ct=0,n=0,i=1,j=1;  //instance varible
		while(n<8)  
		{  
			j=1;  //local varible
			ct=0; 
			while(j<=i)  
			{  
				if(i%j==0)  
					ct++;  
				j++;   
			}  
			if(ct==2)  
			{  
				System.out.printf("%d ",i);  
				n++;  
			}  
			i++;  
		}    
	}  
}