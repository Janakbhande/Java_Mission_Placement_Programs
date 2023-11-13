import java.util.Scanner;

public class pr56 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        while (true) 
        {
            System.out.print("Enter the array size: ");
            int length = s.nextInt();
            s.nextLine();

            if (length < 2) 
            {
                System.out.println("Please enter at least 2 elements in the array.");
            } 
            else 
            {
                System.out.print("Enter array elements separated by spaces: ");
                String str = s.nextLine();

                String[] stringArray = str.split(" ");

                if (stringArray.length < length) 
                {
                    System.out.println("Not enough elements provided in the array.");
                } 
                else 
                {
                    int[] integerArray = new int[length];
                    try {
                        for (int i = 0; i < length; i++) 
                        {
                            integerArray[i] = Integer.parseInt(stringArray[i]);
                        }

                        int largest = integerArray[0];
                        int smallest = integerArray[0];

                        for (int a : integerArray) 
                        {
                            if (a > largest)
                                largest = a;
                            if (a < smallest)
                                smallest = a;
                        }

                        System.out.println("Smallest number is " + smallest + " and Largest number is " + largest + "\n");
                    } 
                    catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter valid integers.");
                    }
                }
            }
        }
    }
}