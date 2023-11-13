//Prime number
import java.util.Scanner;

public class pr39 
{

    static boolean isPrimeNumber(int number)
    {
        int primeCount=0;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				primeCount=primeCount+1;
				break;
			}
		}
        if(primeCount==0)
            return true;
        else
            return false;
    }

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=s.nextInt();
        int count=0;
        
        for(int i=2;i<=number/2;i++)
        {
            int j=number-i;
            if(isPrimeNumber(i) && isPrimeNumber(j))
            {
                count=count+1;
                System.out.println("The number is sum of two primes:"+"\t"+i+" and "+j);
            }
        }
        
    }
}