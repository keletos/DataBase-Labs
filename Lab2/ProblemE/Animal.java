package Lab2.ProblemE;

public abstract class Animal 
{
    String name;
    int age;
    String type;

    public Animal (String newName, int newAge)
    {
        this.name = newName;
        this.age = newAge;
    }

    public abstract String getSound();

    @Override
    public String toString()
    {
        return name;
    }
}
