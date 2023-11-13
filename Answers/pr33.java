//octal to decimal conversion

import java.util.Scanner;
public class pr33 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String octalString = s.next();

        try {
            int decimalNumber = Integer.parseInt(octalString,8);
        System.out.println("Decimal equivalent: "+decimalNumber);
        } catch (NumberFormatException e) {
            System.err.println("Invalid octal input. Please enter a valid octal number.");
        }
    }
}