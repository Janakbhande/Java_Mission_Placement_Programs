//Sum of digits of a number
import java.util.Scanner;

public class pr11 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=s.nextInt();
		
		int r,sum=0;
		while(number>0)
		{
			r=number%10;
			sum=sum+r;
			number=number/10;
		}
		System.out.println(sum);
	}

}
