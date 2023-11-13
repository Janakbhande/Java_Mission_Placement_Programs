// Check whether a character is a alphabet or not

import java.util.Scanner;
public class pr42 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter valid character: "); 
            String str=s.next();
            String str2=str.toLowerCase();
            char ch=str2.charAt(0);
            if((ch>=97)&&(ch<=122))
                System.out.println("Valid alphabet.");
            else
                System.out.println("Invalid alphabet.");
        }
    }
}