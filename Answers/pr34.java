//Quadrants in which a given coordinate lies

import java.util.Scanner;
public class pr34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();
        
        if (x > 0 && y > 0) 
            System.out.println("The coordinate lies in the first quadrant.");
        else if (x < 0 && y > 0)
            System.out.println("The coordinate lies in the second quadrant.");
        else if (x < 0 && y < 0)
            System.out.println("The coordinate lies in the third quadrant.");
        else if (x > 0 && y < 0)
            System.out.println("The coordinate lies in the fourth quadrant.");
        else if (x == 0 && y == 0)
            System.out.println("The coordinate is at the origin.");
        else if (x == 0)
            System.out.println("The coordinate lies on the y-axis.");
        else if (y == 0)
            System.out.println("The coordinate lies on the x-axis.");
               
        scanner.close();
    }
}