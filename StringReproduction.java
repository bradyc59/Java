import java.util.Scanner;

public class StringReproduction
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer and a string: ");
        // Read in the number ... 
        int num = in.nextInt();
        // ... and the string
        String word = in.next();

        // work out what to print
        for(int i = 0; i < num; i++){
            System.out.print(word);

        }
        System.out.println();
    }
}