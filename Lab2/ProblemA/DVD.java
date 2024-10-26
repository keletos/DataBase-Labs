package Lab2.ProblemA;

public class DVD extends LibraryItem
{
    private int duration;
    private int dvdCounter;

    public DVD(String title, String author, String genre, int year, int newDuration) 
    {
        super(title, author, genre, year);
        this.duration = newDuration;

        dvdCounter++;
    }

    public String getInfo()
    {
        return "Title: " + getTitle() + "\r\n" + "Author: " + getAuthor() + "\r\n" + "Genre" + getGenre() + "\r\n" + "Year of publication: " + getPublicationYear() + "\r\n" + "Duration(in minutes): " + duration;
    }

    @Override
    public String toCount() 
    {
        return "DVDs in collection " + dvdCounter;
    }

    public String toString() 
    {
        return "This is DVD in your collection";
    }
}
