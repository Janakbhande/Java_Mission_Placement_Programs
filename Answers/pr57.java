// Calculate the sum of elements in an array

import java.util.Scanner;
public class pr57
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int length= s.nextInt();
        s.nextLine();

        if (length < 2) 
            System.out.println("Please enter at least 2 elements in the array.");
        else 
        {
            System.out.print("Enter array elements separated by spaces: ");
            String str = s.nextLine();
            String[] stringArray = str.split(" ");

            if (stringArray.length < length) 
                System.out.println("Not enough elements provided in the array.");
            else 
            {
                int sum=0;
                int[] integerArray = new int[length];
                try {
                    for (int i = 0; i < length; i++) 
                    {
                        integerArray[i] = Integer.parseInt(stringArray[i]);
                        sum=sum+integerArray[i];
                    }
                    System.out.print("sum of all array integers: "+sum);
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid integers.");
                }
            }
        }
    }
}