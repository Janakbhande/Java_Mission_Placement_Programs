//Decimal to octal Conversion
import java.util.Scanner;
public class pr31 
{
	int decimalToOctal(long n)
	{
		String octalString = Integer.toOctalString((int) n);
		long octalNumber = Integer.parseInt(octalString);
		return (int) octalNumber;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Decimal number :");
		long n = s.nextInt();
		
		pr29 ob1=new pr29();
		System.out.println("Octal number :"+ob1.decimalToOctal(n));
	}
}