import java.util.*;

class Pyramid3
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.print ("Enter Number For Pyramid :");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++)
			{

				for (int j = n - i; j >= 1; j--) 
				{ 
					System.out.print(" "); 
				}

			for (int j = 1; j <= i; j++) 
			{ 

				System.out.print("* "); 

			}
			System.out.println();
			}
		}
}