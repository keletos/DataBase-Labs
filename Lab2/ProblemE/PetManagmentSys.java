package Lab2.ProblemE;

public class PetManagmentSys {
    public static void main(String[] args) 
    {
    Person john = new Employee("John", 30, "Engineer");
    Person alice = new PhDStudent("Alice", 26, 7, "Comp. Science");
    Animal murka = new Cat("Murka", 5);
    Animal doge = new Dog("Dawg", 3);
    john.assignPet(murka); // John owns Rex
    alice.assignPet(doge);
    PersonRegistry registry = new PersonRegistry();
    registry.addPerson(john);
    registry.addPerson(alice);
    // John goes on vacation and leaves Rex with Alice
    john.leavePetWith(alice);
    // Registry reflects that Alice is taking care of Rex
    System.out.println(registry);
    // John returns from vacation and retrieves Rex
    john.retrievePetFrom(alice);
    // Registry reflects that John has his dog back
    System.out.println(registry);
    }
}
