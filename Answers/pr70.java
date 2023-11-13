// Find all Symmetric pairs in an array

// Two pairs (a, b) and (c, d) are said to be symmetric if c is equal to b and a is equal to d. For example, (10, 20) and (20, 10) are symmetric. Given an array of pairs find all symmetric pairs in it. 
// It may be assumed that the first elements of all pairs are distinct.
// Example: 

// Input: arr[] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}}
// Output: Following pairs have symmetric pairs
//         (30, 40)
//         (5, 10)  

import java.util.*;

public class pr70 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int row = s.nextInt();

        int arr[][] = new int[row][2];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                arr[i][j] = s.nextInt();
            }
        }

        // System.out.println("Array elements are: ");
        // for (int i = 0; i < row; i++) 
        // {
        //     for (int j = 0; j < 2; j++) 
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        findSymmetricElements(arr);
    }
    static void findSymmetricElements(int arr[][])
    {
        System.out.println("Symmetric pairs are: ");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) 
                {
                    System.out.println("(" + arr[i][0] + ", " + arr[i][1] + ")");
                }
            }
        }
    }
}