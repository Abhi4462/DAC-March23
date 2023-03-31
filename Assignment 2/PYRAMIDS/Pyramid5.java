import java.util.*;

class Pyramid5
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.print ("Enter Number For Pyramid :");
			int n = sc.nextInt();
			
			for (int i = 1; i <= n; i++) 
			{ 
				
				
				for (int j = n; j > i; j--) 
					{ 
						
						System.out.print("  "); 	
					}
				for(int k= (n+1)-i; k<n; k++)
					{

						System.out.print(k+" ");
						
					}
					
			
														
				for (int k=n;k >n-i;k--)
					{
						
						System.out.print(k+" ");
						
					}
				System.out.println();	
			}

		}
}
