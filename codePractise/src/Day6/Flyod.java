package Day6;

import java.util.Scanner;

public class Flyod {

	public static void main(String[] args) {
		/*int i=1;
		int j=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		int n, num = 1, c, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows of floyd's triangle you want");
		n = in.nextInt();
		System.out.println("Floyd's triangle :-");
		for ( c = 1 ; c <= n ; c++ )
		{
		for ( d = 1 ; d <= c ; d++ )
		{
		System.out.print(num+" ");
		num++;
		}
		System.out.println();
		}
	}
}
