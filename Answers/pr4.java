//Sum of N natural numbers 
import java.util.Scanner;

public class pr4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=s.nextInt();
		int sum=0;
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println(sum);
	}
}