//Program to display prime numbers between 1 to 100
class pr45 
{
	public static void main(String args[]) 
	{
		for (int n = 2; n <= 1000; n++) 
		{
			int count =0;
			for (int i =2; i <= n/2; i++) 
			{
				if (n % i == 0) 
					count = count + 1;
			}
			if (count == 0)
				System.out.print(n + " ");
		} 
	}
}