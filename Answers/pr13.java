//to calculate whether given number is palindrome or not.

import java.util.Scanner;

public class pr13 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=s.nextInt();
		
		int r,palindrome=0, temp=number;
		while(temp>0)
		{
			r=temp%10;
			palindrome=palindrome*10+r;
			temp=temp/10;
		}
		if(palindrome==number)
		{
			System.out.println("Palindrome number.");
		}
		else
		{
			System.out.println("Not a palindrome number.");
		}
	}
}
