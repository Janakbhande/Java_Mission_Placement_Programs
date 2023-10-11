//Program to calculate Armstrong number in a given range
import java.util.Scanner;

public class pr15 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.print("Enter range starting number: ");
		int start=s.nextInt();
		System.out.print("Enter range ending number: ");
		int end=s.nextInt();
		
		
        for(int number=start;number<=end;number++)
        {
			
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
	            System.out.println(number + " ");
	    }
	}

}
