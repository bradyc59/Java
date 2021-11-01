import java.util.Scanner;

public class SumNumber
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int sum = 0;
		int first = 0;
		int one = 1;
		while(first < num)
		{
			sum = sum + one;
			one ++;
			first ++;
		}
		System.out.println("The sum of the numbers from 1 to " + num + " is " + sum);
	}
}