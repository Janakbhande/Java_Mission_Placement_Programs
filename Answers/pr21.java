//Program to whether given number is Automorphic number or not
//A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

import java.util.Scanner;
public class pr21 {
	
	//calculate no of digits in given number
	private static int countOfDigits(int number) {
		int count = 0;
		while(number > 0) {
			count = count+1;
			number = number/10;
		}
		return count;
	}
	//calculate divisor of square of number
	private static int divider(int number) {
		int countOfNum = countOfDigits(number);
		int divider = 1;
		int count = 1;
		while(count <= countOfNum) {
			divider = divider * 10;
			count = count + 1;
		}
		return divider;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :");
		int number = s.nextInt();
		
		int a=countOfDigits(number);
		int div=divider(number);
//		System.out.println(a);
//		System.out.println(div);
		
		int square = number*number;
		if(square%div == number)
		{
			System.out.println("Automorphic number");
		}
		else
		{
			System.out.println("not an Automorphic number");
		}
	}
}