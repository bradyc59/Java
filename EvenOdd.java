import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EvenOdd
{

	public static void main(String [] args)
	{

	Scanner in = new Scanner(System.in);

	List<Integer> even = new ArrayList<Integer>();
	List<Integer> odd = new ArrayList<Integer>();

	System.out.print("Enter numbers: ");
	int num = in.nextInt();

	while(num != -1)
	{
		if(num % 2 == 0)
			even.add(num);

		else
			odd.add(num);

		num = in.nextInt();
	}

	System.out.println("Odd: " + odd);
	System.out.println("Even: " + even);
	}
}