import java.util.Scanner;

public class FirstMiddleLast
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a word: ");

		String word = in.next();


		System.out.println(word.charAt(0));
		System.out.println(word.substring(1, word.length() - 1));
		System.out.println(word.charAt(word.length() - 1));
	}
}