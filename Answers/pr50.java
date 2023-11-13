// Finding number of integers which has exactly x divisors

import java.util.Scanner;
public class pr50 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of divisors: ");
        int divisorNumber = s.nextInt();

        System.out.println(countOfIntegers(divisorNumber));
    }

    static int countOfIntegers(int divisorNumber) 
    {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (numberOfDivisor(i) == divisorNumber) 
            {
                count = count + 1;
            }
        }
        return count;
    }

    static int numberOfDivisor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
