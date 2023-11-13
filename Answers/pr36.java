// Maximum number of handshakes 

import java.util.Scanner;
public class pr36 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number of persons available: ");
        int n=s.nextInt();
        
        System.out.println("Maximum no of possible handshakes among all persons are: "+(n*(n-1)/2));
    }
}
