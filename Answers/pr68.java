// Finding Maximum scalar product of two vectors in an array  

import java.util.*;
class pr68
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = s.nextInt();
        s.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("\nEnter first array Elements separated by space: ");
        String s1 = s.nextLine();

        System.out.print("\nEnter second array Elements separated by space: ");
        String s2 = s.nextLine();

        try {
            String str1[] = s1.split(" ");
            String str2[] = s2.split(" ");

            int arr1[] = new int[size];
            int arr2[] = new int[size];

            for (int i = 0; i < size; i++) 
            {
                arr1[i] = Integer.parseInt(str1[i]);
                arr2[i] = Integer.parseInt(str2[i]);
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum = sum + arr1[i] * arr2[i];
            }
            System.out.print("Minimum scalar product: " + sum + "\n");
        } 
        catch (NumberFormatException e) {
            System.err.println("Invalid input. Please ensure to input integer elements separated with a single space.");
        }
    }
}