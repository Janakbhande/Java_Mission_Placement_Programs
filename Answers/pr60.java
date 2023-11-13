// Sort the elements of an array 

import java.util.*;
class pr60
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter integer array elements seperated with space: ");
        String str= s.nextLine();
        String[] str2= str.split(" ");
        int length= str2.length;
        int[] arr=new int[length];

        try
        {
        for(int i=0;i<length;i++)
        {
            arr[i]=Integer.parseInt(str2[i]);
        }
        java.util.Arrays.sort(arr);
        for(int x: arr)
        {
            System.out.print(x+" ");
        }

    }
    catch(NumberFormatException e)
    {
        System.err.println("Invalid input");
    }
    }
}