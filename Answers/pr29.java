//Binary to Octal conversion 
import java.util.Scanner;
public class pr29 
{
	int binaryToDecimal(long n)
	{
		int decimalNumber = 0, count = 0;
		while(n>0)
		{
			decimalNumber = decimalNumber + (int)(Math.pow(2,count)*(n%10));
			count = count + 1;
			n=n/10;
		}
		return decimalNumber;
	}
	
	long decimalToOctal(long n)
	{
		int decimalNumber = binaryToDecimal(n);
		String octalString = Integer.toOctalString(decimalNumber);
		long octalNumber = Integer.parseInt(octalString);
		return octalNumber;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter binary number :");
		long n = s.nextLong();
		
		pr29 ob1=new pr29();
		System.out.println("Demical number :"+ob1.binaryToDecimal(n));
		System.out.println("Octal number :"+ob1.decimalToOctal(n));
		
	}
}