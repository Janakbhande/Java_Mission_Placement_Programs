// Removing Duplicate elements from an array

import java.util.*;

class pr66
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter integer array elementsm seperated by a space: ");   
        String str=s.nextLine();

        try
        {
            String str2[] = str.split(" ");

            LinkedHashSet<Integer> ts=new LinkedHashSet<>();
            for(int i=0;i<str2.length;i++)
            {
                ts.add(Integer.parseInt(str2[i]));
            }
            System.out.println(ts);
        }
        catch(NumberFormatException e)
        {
            System.err.println("Invalid inpiut. Please ensure to enter only integer elements seperated with a single space!");
        }
    }
}