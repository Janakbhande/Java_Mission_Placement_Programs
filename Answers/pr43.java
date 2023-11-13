// calculate the area of a circle

import java.util.Scanner;
public class pr43 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter radius value: ");
        float radius=s.nextFloat();

        double area=3.14*radius*radius;
        System.out.println("Area of the circle: "+Math.abs(area));
    }    
}