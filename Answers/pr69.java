// Counting the number of even and odd elements in array

import java.util.LinkedHashSet;
import java.util.Scanner;
class pr69
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter integer array elementsm seperated by a space: ");   
        String str=s.nextLine();

        try
        {
            String str2[] = str.split(" ");
            int[] integerArray=new int[str2.length];

            int oddCounts=0;
            int evenCounts=0;
            for(int i=0;i<str2.length;i++)
            {
                integerArray[i]=Integer.parseInt(str2[i]);
                if(integerArray[i]%2==0)
                    evenCounts=evenCounts+1;
                else
                    oddCounts=oddCounts+1;
            }
            System.out.print("Total number of Even numbers: "+evenCounts+"\n");
            System.out.print("Total number of Odd numbers: "+oddCounts+"\n");
        }
        catch(NumberFormatException e)
        {
            System.err.println("Invalid inpiut. Please ensure to enter only integer elements seperated with a single space!");
        }
    }
}