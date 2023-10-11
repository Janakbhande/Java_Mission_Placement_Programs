//Greatest of the Three numbers 
import java.util.Scanner;
public class pr7 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=s.nextInt();
		System.out.println("Enter second number");
		int second=s.nextInt();
		System.out.println("Enter third number");
		int third=s.nextInt();
		int temp=first>second?first:second;  
		//comparing the temp variable with c and storing the result in the variable  
		int largest=third>temp?third:temp;  
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  
	}	
}
