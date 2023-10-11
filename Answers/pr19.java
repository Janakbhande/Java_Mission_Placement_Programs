//Program to calculate factors of given number
import java.util.Scanner;

public class pr19 {

	static void factorsOf(int number)
	{
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number :");
		int number=s.nextInt();
		
		factorsOf(number);
	}

}
