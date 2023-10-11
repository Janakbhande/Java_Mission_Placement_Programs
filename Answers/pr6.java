//Greatest of the Two numbers 
import java.util.Scanner;
public class pr6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=s.nextInt();
		System.out.println("Enter second number");
		int second=s.nextInt();
//		if(first>second)
//		{
//			System.out.println(first+" is grater than "+ second);
//		}
//		else if(second>first)
//		{
//			System.out.println(second+" is grater than "+ first);
//		}
//		else
//		{
//			System.out.println("Both are equal.");			
//		}
		if(first==second)
		{
			System.out.println("Both are equal.");
		}
		else
		{
			System.out.println(Math.max(first,second)+" is greater.");
		}
	}
}
