import java.util.Scanner;
class HollowInvertedPyramid{
	public static void main (String args[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.print ("Enter Number For Pyramid :");
			int n = sc.nextInt();
			
			for (int i=1;i<=n;i++)
			{
				for (int j=1;(n+1)-j>=i;j++)
				{
					if (i==1 || j==1 || j>(n-i))
					{
					System.out.print("* ");
					}
					else
					{
					System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

}