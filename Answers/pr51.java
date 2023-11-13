// Finding Roots of a quadratic equation

import java.util.Scanner;
public class pr51 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        while(true)
        { 
            System.out.print("Enter value of a:");
            float a= s.nextFloat();

            if(a!=0)
            {
                System.out.print("Enter value of b:");
                float b= s.nextFloat();
                System.out.print("Enter value of c:");
                float c= s.nextFloat();

                double sqrtResult= Math.sqrt((b*b)-(4*a*c));
                double denominator1= -b+sqrtResult;
                double denominator2= -b-sqrtResult;
                double numberator= 2*a;

                System.out.println("The roots of given quadratic equation are: ");

                double root1 =denominator1/numberator;
                double root2 =denominator2/numberator;
                if((int)(root1)==root1)
                    System.out.println("1) "+(int)root1);
                else
                    System.out.println("1) "+root1);
                if((int)(root2)==root2)
                    System.out.println("2) "+(int)root2);
                else
                    System.out.println("2) "+root2);
            }
            else
            {
                System.out.println("a should not be zero.");
            }
        }
    }
}
