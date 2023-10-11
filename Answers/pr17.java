//Program to calculate factorial of given number
import java.util.Scanner;

public class pr17 {
	
	static void factorialOf(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=s.nextInt();
		
		factorialOf(number);		
	}

}
