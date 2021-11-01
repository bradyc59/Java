import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
      	int a = in.nextInt();
        // Find out how many inches (use a whole number for integers)
        double result = a * 1.8 + 32;

        // Print out the result
        System.out.println(a + " " + result);
    }
}