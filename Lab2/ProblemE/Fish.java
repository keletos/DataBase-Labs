package Lab2.ProblemE;

public class Fish extends Animal
{
    public Fish (String newName, int newAge)
    {
        super(newName, newAge);
        type = "independent";
    }

    @Override
    public String getSound()
    {
        return "Bulb bulb mthrfcker";
    }
}
