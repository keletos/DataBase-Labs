package Lab2.ProblemE;

public class Cat extends Animal 
{
    public Cat(String newName, int newAge)
    {
        super(newName, newAge);
        type = "independent";
    }

    @Override
    public String getSound()
    {
        return "Meow meow mthrfcker";
    }
}
