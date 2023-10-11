//Abundant number
// an abundant number or excessive number is a positive integer for which the sum of its proper divisors is greater than the number.
import java.util.Scanner;
public class pr23 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number :");
		int n=s.nextInt();
		
		//finding sum of factors of given number
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
//				System.out.print(i+" ");
				sum=sum+i;
			}
		}
//		System.out.println(sum);
		
		if(sum>n)
		{
			System.out.println("Abundant number");
		}
		else
		{
			System.out.println("not an Abundant number");
		}
	}
}