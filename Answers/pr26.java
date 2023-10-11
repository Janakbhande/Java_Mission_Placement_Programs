//Lowest Common Multiple (LCM) 

import java.util.Scanner;

public class pr26 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter First number :");
		int n1=s.nextInt();
		System.out.print("Enter Second number :");
		int n2=s.nextInt();
		int minNum=Math.min(n1, n2);
		int maxNum=Math.max(n2, n1);
		
		int hcf=0;
		for(int i=1;i<=minNum;i++)
		{
			if(minNum%i==0)
			{
				if(maxNum%i==0)
				{
				//  System.out.print(i +" ");
					hcf=i;
				}
			}		
		}
		System.out.println("LCM :"+(n1*n2/hcf));
	}
}