//Greatest Common Divisor 
import java.util.Scanner;
public class pr27 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First number :");
		int n1=s.nextInt();
		System.out.print("Enter Second number :");
		int n2=s.nextInt();
		
		int max=Math.max(n1, n2);
		int min=Math.min(n1, n2);
		
		int gcd=0;
		for(int i=1; i<=min; i++)
		{
			if(min%i==0)
			{
				if(max%i==0)
				{
					gcd=i;
				}
			}
		}
		System.out.println("GCD :"+gcd);
	}
}