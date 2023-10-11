//Positive or Negative number
import java.util.Scanner;

class pr1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any numebr: ");
		int a=s.nextInt();
		if(a>0)
		{
			System.out.println("Positive number");
		}
		else if(a>0)
		{
			System.out.println("Negative numebr");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
