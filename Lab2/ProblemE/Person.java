package Lab2.ProblemE;

import java.util.Objects;

public abstract class Person 
{
    String name;
    int age;
    Animal assignedAnimal;

    Animal tempAnimal;

    public Person(String newName, int newAge)
    {
        this.name = newName;
        this.age = newAge;
    }

    public void assignPet(Animal newPet)
    {
        this.assignedAnimal = newPet;
    }

    public void removePet()
    {
        this.assignedAnimal = null;
    }

    public boolean hasPet()
    {
        return this.assignedAnimal != null;
    }

    public void leavePetWith(Person person)
    {
        if (assignedAnimal == null) 
        {
            return;
        }
        person.tempAnimal = assignedAnimal;
        assignedAnimal = null;
    }

    public void retrievePetFrom(Person person)
    {
        if (person.tempAnimal == null) 
        {
            return;
        }
        assignedAnimal = person.tempAnimal;
        person.tempAnimal = null;
    }

    public abstract String getOccupation();

    @Override
    public String toString()
    {
        if (this.assignedAnimal == null) 
        {
            return name + " " + age;
        }
        else 
        {
            return name + " " + age + " " + assignedAnimal;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) 
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) 
        {
            return false;
        }

        Person person = (Person) obj;

        return age == person.age && 
            name.equals(person.name) && 
            assignedAnimal.equals(person.assignedAnimal);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(name, age, assignedAnimal);
    }

}
