//Sum of numbers in a given range
import java.util.Scanner;
public class pr5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter range start number: ");
		int start=s.nextInt();
		System.out.print("Enter range ending number: ");
		int end=s.nextInt();
		int sum=0;
		while(end>=start)
		{
			sum=sum+end;
			end--;
		}
		System.out.println(sum);
	}
}