public abstract class Animal
{
    public Animal(String name)
    {
        this.name = name;
    }

    public abstract String hello();

    public String greeting()
    {
    	return hello() + ", je m'appelle " + name;
    }
 
    // private
    private String name;
}