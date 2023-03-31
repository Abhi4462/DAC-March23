import java.util.Scanner;
class InvertedHalfPyramid{
	public static void main (String args[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.print ("Enter Number For Pyramid :");
			int n = sc.nextInt();
			
			for (int i=1;i<=n;i++)
			{
				for (int j=1;(n+1)-j>=i;j++)
				{
				System.out.print("*");
				}
				System.out.println();
			}
		}

}