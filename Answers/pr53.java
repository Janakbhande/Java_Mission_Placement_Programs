// Find Smallest Element in an Array

import java.util.Scanner;
public class pr53 
{
    static void smallestOf(int arr[])
    {
        int smallest=arr[0];

        for(int a: arr)
        {
            if(smallest>a)
                smallest=a;
        }
        System.out.println("Smallest integer is: "+smallest);
    }
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter integer array size: ");
        int arraySize=s.nextInt();
        System.out.println("Enter array elements: ");
        int arr[]= new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            arr[i]=s.nextInt();
        }

        smallestOf(arr);
    
    }
}