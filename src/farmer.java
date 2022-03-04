import java.util.ArrayList;
public class farmer
{
    //create brain method sing and backstory

    //1 instance variables
    public String name;

    //2 constructors
    public farmer(String name)
    {
        this.name = name;
    }

    //4 getters
    public String getName()
    {
        return name;
    }

    //5 setters
    public void setName(String name)
    {
        this.name = name;
    }

    //6 brain method
    public String song(ArrayList<animal> farm)
    {
        String output = "";
        for(int i = 0; i < farm.size(); i++)
        {
            if(farm.get(i).getType() == "Cow")
            {
                output += "\nOld MacDonald had a farm" +
                        "\nE-I-E-I-O" +
                        "\nAnd on his farm he had a " + farm.get(i).getType() + " named " + ((cow)farm.get(i)).getName() +
                        "\nE-I-E-I-O" +
                        "\nWith a " + farm.get(i).getSound() + " " + farm.get(i).getSound() + " here" +
                        "\nAnd a " + farm.get(i).getSound() + " " + farm.get(i).getSound() + " there" +
                        "\nHere a " + farm.get(i).getSound() + ", there " + farm.get(i).getSound() +
                        "\nEverywhere a " + farm.get(i).getSound() + " " + farm.get(i).getSound() +
                        "\nOld MacDonald had a farm" +
                        "\nE-I-E-I-O\n";
            }
            else
            {
                output += "\nOld MacDonald had a farm" +
                        "\nE-I-E-I-O" +
                        "\nAnd on his farm he had a " + farm.get(i).getType() +
                        "\nE-I-E-I-O" +
                        "\nWith a " + farm.get(i).getSound() + " " + farm.get(i).getSound() + " here" +
                        "\nAnd a " + farm.get(i).getSound() + " " + farm.get(i).getSound() + " there" +
                        "\nHere a " + farm.get(i).getSound() + ", there " + farm.get(i).getSound() +
                        "\nEverywhere a " + farm.get(i).getSound() + " " + farm.get(i).getSound() +
                        "\nOld MacDonald had a farm" +
                        "\nE-I-E-I-O\n";
            }
        }
            return output;
    }
}
