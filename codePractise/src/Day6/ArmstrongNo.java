package Day6;

import java.util.Scanner;

public class ArmstrongNo
{
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int temp=i;
		int digit=0;
		int rem=0;
		double sum=0.0;
		while(i!=0)
		{
			digit=digit+1;
			
			i=i/10;
		}
		i=temp;
		while(i!=0)
		{
			rem=i%10;
			sum=sum+Math.pow(rem, digit);
			i=i/10;
		}
		if(sum==temp)
		{
			System.out.println("NUMBER IS ARMSTRONG");
		}
		else
		{
			System.out.println("NUMBER IS NOT-ARMSTRONG");
		}
	}
}