package Lab2.ProblemE;

public class Student extends Person{
    int yearOfStudy;
    String major;

    public Student(String newName, int newAge, int newYearOfStudy, String newMajor) 
    {
        super(newName, newAge);
        this.yearOfStudy = newYearOfStudy;
        this.major = newMajor;
    }

    @Override
    public String getOccupation() 
    {
        return major;
    }
}
