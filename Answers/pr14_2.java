//to calculate whether given number is armstrong or not.
//ex:	1) 	153==>1**3+5**3+3**3==>153
//		2)	1634==>1**4+6**4+3**4+4**4==>1634

import java.util.Scanner;

public class pr14_2 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.print("Enter any number: ");
        int number=s.nextInt();
		
		int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

}
