public class cow extends animal
{
    //1 instance variables
    public String name;

    //2 constructors
    public cow(String type, String sound, String name)
    {
        super(type, sound);
        this.name = name;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                        "The name of this cow is: " + name;
        return output;
    }

    public String getName()
    {
        return name;
    }
}
