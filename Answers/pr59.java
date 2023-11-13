// Sort first half in ascending order and second half in descending 

import java.util.Arrays;
import java.util.Scanner;

public class pr59 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        while (true) 
        {
            System.out.print("\nEnter array elements separated by spaces: ");
            String str = s.nextLine();
            String[] stringArray = str.split(" ");
            int length = stringArray.length;

            if (length < 2) 
            {
                System.out.println("Not enough elements provided in the array.");
            } 
            else {
                int[] integerArray = new int[length];

                try 
                {
                    for (int i = 0; i < length; i++)
                        integerArray[i] = Integer.parseInt(stringArray[i]);

                    Arrays.sort(integerArray, 0, length / 2);
                    
                    int[] arr2 = Arrays.copyOfRange(integerArray, length / 2, length);
                    Arrays.sort(arr2);
                    
                    int[] arr3 = new int[length / 2];
                    if(length%2==0)
                    {
                        for (int i = 0; i < arr2.length; i++) 
                        {
                        arr3[i] = arr2[arr2.length - 1 - i];
                        }
                    }
                    else
                    {
                        for (int i = 0; i < arr2.length-1; i++) 
                        {
                        arr3[i] = arr2[arr2.length - 1 - i];    
                        }
                    }
                    if(length%2==0)
                    {
                        for (int i=0 ;i<length/2; i++)
                        System.out.print(integerArray[i] + " ");

                        for (int element : arr3)
                            System.out.print(element + " ");
                    }
                    else
                    {
                        for (int i=0 ;i<=length/2; i++)
                            System.out.print(integerArray[i] + " ");

                        for (int i=1 ;i<arr3.length; i++)
                            System.out.print(arr3[i] + " ");
                    }

                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("Invalid input. Please enter valid integers.");
                }
            }
        }
    }
}
