//Leap year or not 
import java.util.Scanner;
public class pr8 
{
	public static void isLeapYear(int year)
	{
		boolean is_leap_year;
		if(year%4==0)
		{
			is_leap_year=true;
			if(year%100==0)
			{
				is_leap_year=false;
				if(year%400==0)
				{
					is_leap_year=true;
				}
			}
		}
		else
		{
			is_leap_year=false;
		}
			
		if(!is_leap_year)
		{
			System.out.println(year+" is not leap year.");
		}
		else
		{
			System.out.println(year+ " is leap year.");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=s.nextInt();
		isLeapYear(year);
	}
}