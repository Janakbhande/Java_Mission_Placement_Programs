//Prime number
import java.util.Scanner;

public class pr9 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=s.nextInt();
		
		int count=0;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count=count+1;
				System.out.println("Not a prime number.");
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Prime number.");
		}
		
	}
}
