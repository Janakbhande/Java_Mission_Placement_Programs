// Calculate the number of digits in an integer

import java.util.Scanner;
public class pr46 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter integer number: "); 
        int n= s.nextInt();
        int digitInN=0;

        while(n>0)
        {
            int r= n%10;
            digitInN= digitInN +1;
            n=n/10;
        }
        System.out.println(digitInN);
    }
}
