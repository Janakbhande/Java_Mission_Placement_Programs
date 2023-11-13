// Counting Distinct Elements in an Array 

import java.util.*;
public class pr63 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter array integer elements seperated by space: "); 
        String str= s.nextLine();       
        String[] str2= str.split(" ");

        try
        {
            ArrayList<Integer> al= new ArrayList<>();
            TreeSet<Integer> ts= new TreeSet<>();
            for(int i=0;i<str2.length;i++)
            {
                al.add(Integer.parseInt(str2[i]));
                ts.add(Integer.parseInt(str2[i]));
            }

            int count=0;
            for(int x: ts)
            {
                int times =0;
                for(int y:al)
                {
                    if(x==y)
                        times=times+1;
                    
                }
                if(times<=1)
                        count=count+1;
            }
            System.out.println("Number of distinct elements availble in given array are :" +count);            
        }
        catch(NumberFormatException e)
        {
           System.err.println("Invalid input. Please ensure you given integers only and all integers seperated by single space!");
        }
    }    
}
