// addition of two fractions

import java.util.Scanner;
public class pr37 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first fraction
        System.out.print("Enter the numerator of the first fraction: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int den1 = scanner.nextInt();

        // Input for the second fraction
        System.out.print("Enter the numerator of the second fraction: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the denominator of the second fraction: ");
        int den2 = scanner.nextInt();

        // Find the common denominator
        int commonDenominator = den1 * den2;

        // Add the fractions
        int resultNumerator = (num1 * den2) + (num2 * den1);

        // Simplify the result
        int gcd = findGCD(resultNumerator, commonDenominator);
        resultNumerator /= gcd;
        commonDenominator /= gcd;

        System.out.println("The sum of the fractions is: " + resultNumerator + "/" + commonDenominator);

        scanner.close();
    }

    // Find the greatest common divisor (GCD) using Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}