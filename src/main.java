import java.util.ArrayList;
public class main
{
    public static void main(String[] args) {
        ArrayList<animal> farm = new ArrayList<animal>();
        animal chickBaby = new chick("chick", "ahhh", 2);
        animal chickGrown = new chick("chicken", "boo", 5);
        animal cow = new cow("Cow", "moo", "Timon");
        animal pig = new pig("Pig", "oink");

        farm.add(chickBaby);
        farm.add(chickGrown);
        farm.add(cow);
        farm.add(pig);

        farmer McDonald = new farmer("Old McDonald");

        System.out.println(McDonald.song(farm));
    }
}
