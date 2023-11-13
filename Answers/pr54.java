// Fing second smallest number in an array

import java.util.Scanner;
public class pr54
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);

        while(true)
        {
            System.out.print("\nEnter array size: ");
            int length= s.nextInt();
            s.nextLine();

            if(length<2)
                System.out.println("minimun 2 elements reeuired in the array.");
            else
            {
                System.out.print("Enter array elements seperated by space: ");
                String str= s.nextLine();
                
                String[] stringArray= str.split(" ");

                if(stringArray.length<length)
                    System.out.println("Not enough elements provided in the array.");
                else
                {
                    int[] integerArray =new int[length];
                    
                    for(int i=0;i<length;i++)
                    {
                        integerArray[i]= Integer.parseInt(stringArray[i]);
                        System.out.print(integerArray[i]+" ");
                    }

                    int smallest= Integer.MAX_VALUE;
                    int secondSmallest= Integer.MAX_VALUE;
                    
                    for(int a: integerArray)
                    {
                        if(a<smallest)
                        {
                            secondSmallest= smallest;
                            smallest= a;
                        }
                        else if(a<secondSmallest && a!=smallest)
                        {
                            secondSmallest= a;
                        }
                    }
                    if(secondSmallest==Integer.MAX_VALUE)
                        System.out.println("There is no second smallest value available in array");
                    else
                        System.out.println("\nsmallest is " + smallest+" and Second smallest is "+secondSmallest);
                
                }
            }
        }
    }
}