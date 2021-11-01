import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Previous
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);

    	HashSet<Integer> numbers = new HashSet<Integer>();

    	System.out.println("Enter some numbers (-1 to end)");

    	int num = in.nextInt();

    	System.out.println("Previous:");
    	while(num != -1)
    	{
    		numbers.add(num);
    		num = in.nextInt();
    		if(numbers.contains(num))
    			System.out.println(num);	
    	}
    }
}