import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");
        // Read in the two lines
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        // INSERT YOUR CODE HERE
        // it should work out what the number of matching characters is
        for(int i = 0;i < line1.length(); i ++)
        {
            char c = line1.charAt(i);
            char d = line2.charAt(i);
            if (c == d)
            {
                numMatching ++;
            }

        }
        // Print out the solution
        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}