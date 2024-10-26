package Lab2.ProblemE;

public class Employee extends Person
{
    String occupation;

    public Employee(String newName, int newAge, String newOccupation)
    {
        super(newName, newAge);
        this.occupation = newOccupation;
    }

    @Override
    public String getOccupation() 
    {
        return occupation;
    }
}
