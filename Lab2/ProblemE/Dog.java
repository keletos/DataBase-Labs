package Lab2.ProblemE;

public class Dog extends Animal
{
    public Dog(String newName, int newAge)
    {
        super(newName, newAge);
        type = "high-maintenance";
    }

    @Override
    public String getSound()
    {
        return "Gav gav mthrfcker";
    }

    @Override
    public String toString()
    {
        return "Ooooo, my dog wha sup";
    }
}
