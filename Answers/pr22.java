//Harshad number
//a harshad number (or Niven number) in a given number base is an integer that is divisible by the sum of its digits when written in that base.
//21==>(21/2+1)=7

import java.util.Scanner;
public class pr22 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number :");
		int n=s.nextInt();
		
		//finding sum of number as diviser
		int temp=n, sum=0, r;
		while(temp>0)
		{
			r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		//System.out.println(sum);
		
		if(n%sum==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("not an Harshad number");
		}
	}
}