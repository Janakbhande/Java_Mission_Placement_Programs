// Finding Non Repeating elements in an Array 

import java.util.*;

class pr65
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter integer array elementsm seperated by a space: ");   
        String str=s.nextLine();

        try
        {
            String str2[] = str.split(" ");

            ArrayList<Integer> al= new ArrayList<>();
            TreeSet<Integer> ts=new TreeSet<>();
            for(int i=0;i<str2.length;i++)
            {
                al.add(Integer.parseInt(str2[i]));
                ts.add(Integer.parseInt(str2[i]));
            }

            for(int x: ts)
            {
                int times=0;
                for(int y: al)
                {
                    if(x==y)
                        times=times+1;
                }
                if(times==1)
                    System.out.print(x+" ");
            }
        }
        catch(NumberFormatException e)
        {
            System.err.println("Invalid inpiut. Please ensure to enter only integer elements seperated with a single space!");
        }
    }
}