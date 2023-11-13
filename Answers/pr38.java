// replace all 0's with 1 in a given integer

import java.util.Scanner;
public class pr38 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int number=s.nextInt();
        int updatedNumber=0;
        while(number>0)
        {
            int r=number%10;
            if(r==0)
            {
                r=1;
            }
            updatedNumber=updatedNumber*10+r;
            number/=10;
        }
        System.out.println(updatedNumber);
    }
}
