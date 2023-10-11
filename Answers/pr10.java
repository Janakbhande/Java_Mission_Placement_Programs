//Prime number within a given range 
import java.util.Scanner;

public class pr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		System.out.print("Enter range starting number: ");
		int start =s.nextInt();
		System.out.print("Enter range ending number: ");
		int end =s.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(i!=1) {
				if(count==0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}

}
