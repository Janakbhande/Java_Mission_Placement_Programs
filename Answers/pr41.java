// Check whether a character is a vowel or consonant

import java.util.Scanner;
public class pr41 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter valid character alphabet: "); 
            String str=s.next();
            String str2=str.toLowerCase();
            char ch=str2.charAt(0);
            if((ch>=97)&&(ch<=122))
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    System.out.println("Vowel");
                else
                    System.out.println("Cansonant");
            }
            else
                System.out.println("Please enter alphabet character only.");
        }
    }
}