//Program to whether given number is Perfect number or not
// a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.

import java.util.Scanner;
public class pr20 {
	
	static void isPerfect(int number)
	{
		int sumOfFact=sumOfFactorial(number);
		//to check whether sum of factorial equals to the number or not
		if(sumOfFact==number)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
	
	//to calculate sum of factorials
	private static int sumOfFactorial(int number) {
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number :");
		int number=s.nextInt();

		isPerfect(number);
	}

}
