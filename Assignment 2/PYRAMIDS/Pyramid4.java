import java.util.*;

class Pyramid4
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.print ("Enter Number For Pyramid :");
			int n = sc.nextInt();
			
			for (int i = 1; i <= n; i++) 
			{ 
				int l=1;
				
				for (int j = n; j > i; j--) 
					{ 
						
						System.out.print("  "); 	
					}

				for (int k = n-i; k <= n; k++)
					{

						System.out.print(+" ");
						l++;
					}
					
			
														
				for (int j=1;j<=i-1;j++)
					{
						
						System.out.print(i+" ");
						//j++;
					}
				System.out.println();	
			}

		}
}
