package Lab2.ProblemE;

import java.util.Vector;

public class PersonRegistry 
{
    Vector <Person> peoples;
    
    public PersonRegistry()
    {
        peoples = new Vector<>();
    }

    public void addPerson(Person person)
    {
        peoples.add(person);
    }

    public void removePerson(Person person)
    {
        peoples.remove(person);
    }

    public void findWithPets()
    {
        System.out.println("Peoples with pets:\r\n");
        for (Person person : peoples) 
        {
            if (person.assignedAnimal != null) 
            {
                System.out.println(person.toString());
            }
        }
    }

    public void findWithoutPets()
    {
        System.out.println("Peoples without pets:\n");
        for (Person person : peoples) 
        {
            if (person.assignedAnimal == null) 
            {
                System.out.println(person.toString());
            }
        }
    }

    public void info (Person person)
    {
        System.out.println(person.toString());
    }

    @Override
    public String toString()
    {
        String output = "";

        for (Person person : peoples) 
        {
            output += person + "\n";
        }

        return output;
    }
}
