public class animal
{
    //1 instance variables
    public String type;
    public String sound;

    //2 constructors
    public animal(String type, String sound)
    {
        this.type = type;
        this.sound = sound;
    }

    //4 getters
    public String getType()
    {
        return type;
    }
    public String getSound()
    {
        return sound;
    }

    //5 setters
    public void setType(String name)
    {
        this.type = type;
    }
    public void setSound(String sound)
    {
        this.sound = sound;
    }
}
