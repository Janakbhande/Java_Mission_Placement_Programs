import java.util.Scanner;
public class pr35 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        
        System.out.print("Enter the total number of people (n): ");
        int n = s.nextInt();

        System.out.print("Enter the number of seats (r): ");
        int r = s.nextInt();

        if (n >= r && n >= 0 && r >= 0) 
        {
            long permutations = calculatePermutations(n, r);
            System.out.println("Permutations: " + permutations);
        } 
        else 
        {
            System.out.println("Invalid input. Please ensure n is greater than or equal to r, and both n and r are non-negative.");
        }
    }


    static long calculatePermutations(int n, int r) 
    {
        return factorial(n) / factorial(n - r);
    }
        
    
    static long factorial(int n) 
    {
        if (n == 0) 
            return 1;
        else
            return n * factorial(n - 1);
    }

}