public class Catch
{
    public static void main(String [] args)
    {
		Broken broke = new Broken();

		try
		{
			System.out.println("Testing");
			broke.cracked();
		}
		catch(NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e.getClass().getSimpleName());
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}