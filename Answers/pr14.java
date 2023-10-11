//to calculate whether given number is armstrong or not.
//ex:	1) 	153==>1**3+5**3+3**3==>153
//		2)	1634==>1**4+6**4+3**4+4**4==>1634

import java.util.Scanner;

public class pr14 {

	public static void main(String[] args) {
		
		//user input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=s.nextInt();
		
		//calculating number of digits in given number
		int r, count = 0, t=number;
		while(t>0)
		{
			r=t%10;
			count=count+1;
			t=t/10;
		}
		//System.out.println(count);	
		
		//calculate armstrong value
		int armstrong=0,remainder, temp=number;
		for(int i=0;i<count;i++)
		{
			remainder=temp%10;
			armstrong=(int)(armstrong+Math.pow(remainder, count));		
			temp=temp/10;
		}
		//System.out.println(armstrong);	//armstrong value checking
		
		
		//check equality and print whether number is armstrong or not
		if(armstrong==number)
		{
			System.out.println("Armstrong numebr.");
		}
		else
			System.out.println("Not an armstrong number.");
	}

}
