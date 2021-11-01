import java.util.Scanner;

public class AboveAverage
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers: ");

		int num = in.nextInt();

		double [] a = new double[num];

		System.out.print("Enter " + num + " numbers: ");

		double sum = 0;

		for(int i = 0; i < num; i++)
		{
			double n = in.nextDouble();
			sum = sum + n;
			a[i] = n;
		}

		double average = sum / num;

		System.out.println("The above average numbers are:");
		for(int i = 0; i < num; i++)
		{
			if(a[i] > average)
			{
				System.out.print(" " + a[i]);
			}
		}
		System.out.println();
	}
}