//Reverse of a number 
import java.util.Scanner;

public class pr12 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=s.nextInt();
		
		int r;
		while(number>0)
		{
			r=number%10;
			System.out.print(r);
			number=number/10;
		}
	}

}
