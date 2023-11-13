// Find Largest element in an array

import java.util.Scanner;
public class pr55 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter array size: ");
            int length= s.nextInt();
            s.nextLine();

            if(length<2)
                System.out.println("Enter minimun 2 array elements");
            else
            {
                System.out.print("Enter array elements seperated by a space: ");
                String str= s.nextLine();

                String[] stringArray= str.split(" ");
                
                if(stringArray.length<length)
                    System.out.println("Not enough elements provided in the array.");
                else
                {
                    int[] integerArray= new int[length];
                    for(int i=0;i<length;i++)
                    {
                        integerArray[i]=Integer.parseInt(stringArray[i]);
                    }
                    int largest= integerArray[0];

                    for(int a: integerArray)
                    {
                        if(a>largest)
                            largest=a;
                    }
                    System.out.println("Largest number is "+largest+"\n");
                }
            }
        }        
    }
}