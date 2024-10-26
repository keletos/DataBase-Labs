package Lab2.ProblemE;

public class Bird extends Animal
{
    public Bird (String newName, int newAge)
    {
        super(newName, newAge);
        type = "high-maintenance";
    }

    @Override
    public String getSound()
    {
        return "Chik-chirik mthrfcker";
    }
}
