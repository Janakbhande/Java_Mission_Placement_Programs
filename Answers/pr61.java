// Finding the frequency of elements in an array 

import java.util.*;
class pr61
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
                arr[i]=Integer.parseInt(str2[i]);

            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<length;i++)
                al.add(arr[i]);
            System.out.println(al);

            TreeSet<Integer> ts =new TreeSet<>();
            for(int i=0;i<length;i++)
                ts.add(arr[i]);

            Iterator<Integer> i= ts.iterator();
            
            while(i.hasNext())
            {
                int count=0;
                int x=i.next();
                for(int y: al)
                {
                    if(x==y)
                        count=count+1;
                }
                System.out.println(x +" is available "+count+" times.");
            }

        }
        catch(NumberFormatException e)
        {
            
            System.err.println("Invalid input");
        }
    }
}