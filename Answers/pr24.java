//Friendly pair
//friendly pairs are two numbers with a common abundancy index, the ratio between the sum of divisors of a number and the number itself i.e ?(n)/n. S o, two number n and m are friendly number if 
//?(n)/n = ?(m)/m. 
//where ?(n) is the sum of divisors of n.
import java.util.Scanner;
public class pr24
{
	//finding sum of factors of given number
	private static int sumOfFact(int number)
	{
		int sum=0;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
		//		System.out.print(i+" ");
				sum=sum+i;
			}
		}
		//System.out.println(sum);
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First number :");
		int n=s.nextInt();
		System.out.print("Enter Second number :");
		int m=s.nextInt();
		
		int sumOfFactInN=sumOfFact(n);
		int sumOfFactInM=sumOfFact(m);
		
		if((sumOfFactInN/n)==(sumOfFactInM/m))
		{
			System.out.println("Friendly pair");
		}
		else
		{
			System.out.println("not a Friendly pair");
		}
	}
}