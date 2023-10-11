//Even or Odd number
import java.util.Scanner;

public class pr2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}