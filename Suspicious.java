import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;

public class Suspicious
{
    public static void main(String [] args)
    {
    	try
    	{
    	Scanner students = new Scanner(new File(args[0]));
    	Scanner delinquents = new Scanner(new File(args[0]));

    	HashSet<String> stud = new HashSet<String>();
    	HashSet<String> deli = new HashSet<String>();

    	while(students.hasNextLine())
    	{
    		stud.add(students.nextLine().trim()); // using trim to remove whitespace from either side of string

    		int i = 1; // using to start line numbering
    		while(delinquents.hasNextLine())
    		{
    			String name = deli.iterator();
    			if(stud.contains(name))
    			{
    				System.out.println(i + ". " + name);
    				i++;
    			}
    		}
    	}
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("Please enter correct file names");
    	}

    }
}