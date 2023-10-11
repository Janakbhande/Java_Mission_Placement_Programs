//Program to calculate fibonacci series upto of given nth term
import java.util.Scanner;


public class pr16 {

	static void fibonacciOf(int terms)
	{
		int count=2;
		int f1=0;
		int f2=1;
		int temp;
		System.out.print("Fibonacci series: 0"+" 1");
		while(count<terms)
		{
			temp=f1+f2;
			f1=f2;
			f2=temp;
			count=count+1;
			System.out.print(" "+temp);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("nth term of fibonacci series: ");
		int number=s.nextInt();
		
		fibonacciOf(number);
	}

}
