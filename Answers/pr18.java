//Program to calculate power of given number
import java.util.Scanner;

public class pr18 {

	static void power(int base,int exponent)
	{
		int temp=base;
		for(int i=1;i<exponent;i++)
		{
			base=temp*base;
		}
		System.out.println(base);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("Enter base number :");
		int base=s.nextInt();
		System.out.print("Enter exponent number :");
		int exponent=s.nextInt();
		
		power(base,exponent);
	}

}
