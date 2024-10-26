package Lab2.ProblemA;

public abstract class LibraryItem {
    private String title;
    private String author;
    private String genre;
    private int publicationYear;

    private static int itemCounter;

    public LibraryItem(String t, String a, String g, int y)
    {
        this.title = t;
        this.author = a;
        this.genre = g;
        this.publicationYear = y;

        itemCounter++; 
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getPublicationYear()
    {
        return publicationYear;
    }
       
    public String toCount() 
    {
        return "Items in collection " + itemCounter;
    }

    public String toString()
    {
        return "This is item in your collection";
    }
}
