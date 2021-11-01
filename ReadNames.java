import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNames
{
	public static void main(String[] args)
	{
		try
		{
			Scanner filename = new Scanner(new File(args[0]));

			int num = filename.nextInt();

			String [] names = new String[num];

			for(int i = 0; i < num; i++)
			{
				names[i] = filename.next();
			}

			System.out.println("The names in reverse order are:");
			for(int i = num - 1 ; 0 <= i; i--)
			{
				System.out.print(names[i] + " ");
			}
		}
		catch(Exception e)
		{
			System.err.println("Usage: java ReadNames <filename>");
		}
	}
}