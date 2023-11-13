// Reverse an Array

import java.util.Scanner;
public class pr58 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);

        while(true)
        {
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
                    int[] integerArrayRevese = new int[length];
                    try {
                        for (int i = 0; i < length; i++) 
                        {
                            integerArrayRevese[i] = Integer.parseInt(stringArray[length-i-1]);
                        }
                        for(int a: integerArrayRevese)
                            System.out.print(a+" ");
                        System.out.println();
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter valid integers.");
                    }
                    catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Invalid input. Please enter valid integers.");
                    }
                }
            }
        }
    }
}