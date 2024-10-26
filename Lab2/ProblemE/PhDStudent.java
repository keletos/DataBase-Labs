package Lab2.ProblemE;

public class PhDStudent extends Person
{
    int yearOfStudy;
    String major;
    
    public PhDStudent(String newName, int newAge, int newYearOfStudy, String newMajor) 
    {
        super(newName, newAge);
        this.yearOfStudy = newYearOfStudy;
        this.major = newMajor;
    }

    @Override
    public void assignPet(Animal newPet)
    {
        if (newPet.type.equals("high-maintenance")) 
        {
            System.out.println("This person is too busy for petting \n");
        }
        else
        {
            this.assignedAnimal = newPet;
        }
    }
    
    @Override
    public String getOccupation() 
    {
        return major;
    }
}
