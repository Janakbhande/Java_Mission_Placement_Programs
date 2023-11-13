//octal to binary conversion

import java.util.Scanner;
public class pr32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = s.next();

        try {
            int integerNumber = Integer.parseInt(octalString, 8);
            String binaryString = Integer.toBinaryString(integerNumber);
            System.out.println("Binary equivalent: " + binaryString);
        } catch (NumberFormatException e) {
            System.err.println("Invalid octal input. Please enter a valid octal number.");
        }
    }
}