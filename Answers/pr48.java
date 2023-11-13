// Counting number of days in a given month of a year in java

import java.util.Scanner;
class pr48
{

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month=s.nextInt();
        System.out.print("Enter year number: ");
        int year=s.nextInt();
        if(month<=12 && month>0)
            {
            if((month==2) && ((year%4==0) || ((year%100!=0)&&(year%400==0))))
                System.out.println("Number of days is 29");

            else if(month==2)
                System.out.println("Number of days is 28");

            else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
                System.out.println("Number of days is 31");

            else
                System.out.println("Number of days is 30");
        }
        else
        {
            System.out.println("Enter valid month number between 1 to 12.");
        }
    }
}