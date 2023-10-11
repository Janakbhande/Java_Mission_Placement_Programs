//Binary to Decimal to conversion 
import java.util.Scanner;
public class pr28 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter binary number :");
		int n = s.nextInt();
		
		int r, decimalNumber = 0, count = 0;
		while(n>0)
		{
			r = n%10;
			decimalNumber = decimalNumber + ( (int) Math.pow(2,count)*r);
			count = count + 1;
			n=n/10;
		}
		System.out.println(decimalNumber);
	}
}