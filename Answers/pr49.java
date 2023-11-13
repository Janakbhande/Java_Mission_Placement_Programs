// Finding Number of times x digit occurs in a given input

import java.util.Scanner;
public class pr49 
{
    static int numberOfOcuurenceOf(String str, int digit)
    {
        int length=str.length();    //calcualting no of digits
        int number=Integer.parseInt(str);   //converting string 

        int count=0;                //to measure number of occrances of digits in the number

        int[] ithNumber= new int[length];   //to take the number and store it an integer array where each digit is array element
        for(int i=0;i<length;i++)
        {
            ithNumber[i]=number%10;
            number=number/10;
        }
        // for(int i=length-1;i>=0;i--)    //printing the number digits
        // {
        //     System.out.print(ithNumber[i]+" ");
        // }
        
        for(int i=0;i<length;i++)      //to add counts of occurences of the given digits in the number
        {
            if(ithNumber[i]==digit)
            {
                count = count+1;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter integer number: ");
        String str= s.next();       //String is used to count no of digits in the number and then give array size

        System.out.print("Enter a digit in number to check its number of occurences in the number: ");
        int digit=s.nextInt();      //taking the digit

        int count=numberOfOcuurenceOf(str, digit);
        System.out.println("\n"+digit+" occurs "+count+" times in "+str);
        
    }    
}
