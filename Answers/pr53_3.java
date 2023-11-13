// Find Smallest Element in an Array

import java.util.Scanner;
public class pr53_3 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter integer array with first element as array size and all elements seperated by space: ");
        String array = s.nextLine();
        String arrayString[] = array.split(" ");

        int length = arrayString.length;

        int arrayInteger[] = new int[length];

        for(int i=0;i<length-1;i++)
        {
            arrayInteger[i]= Integer.parseInt(arrayString[i+1]);
            System.out.print(arrayInteger[i]+" ");
        }

        int smallest=arrayInteger[1];
        for(int i=0;i<length-1;i++)
        {
            if(smallest>arrayInteger[i])
                smallest= arrayInteger[i];
        }
        System.out.println("\n\n Smallest integer is: "+smallest+"\n"); 
    }    
}