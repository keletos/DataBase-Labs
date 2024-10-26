package Lab2.ProblemA;

public class LibraryItemTester {
    public static void main(String[] args) {
        Book book1 = new Book("Neuromancer", "William Gibson", "Science fiction", 1984, 271);
        System.out.println(book1.getInfo());
        
        DVD dvd1 = new DVD("Terminator", "James Cameron", "Science fiction, action", 1985, 107);
        System.out.println(dvd1.getInfo());
    }
}
