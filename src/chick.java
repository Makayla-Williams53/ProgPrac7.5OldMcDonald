public class chick extends animal
{
    //1 Instance Variables
    public int age;

    //2 constructors
    public chick(String type, String sound, int age)
    {
        super(type, sound);
        this.age = age;
        if(age > 3)
        {
            super.setSound("peep");
        }
        else
        {
            super.setSound("cheep");
        }
    }

    //4 getters
    public int getAge()
    {
        return age;
    }

    //5 setters
    public void setAge(int age)
    {
        this.age = age;
    }
}
