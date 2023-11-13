// Find the ASCII value of a character

import java.util.Scanner;
public class pr44 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch=s.next().charAt(0);

        System.out.print("ASCII value: "+ch*1);
    }    
}
