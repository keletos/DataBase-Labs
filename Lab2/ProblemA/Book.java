package Lab2.ProblemA;


public class Book extends LibraryItem{
    private int numberOfPages;
    private int bookCounter;

    public Book(String title, String author, String genre, int year, int pages) 
    {
        super(title, author, genre, year);
        this.numberOfPages = pages;

        bookCounter++;
    }

    public String getInfo()
    {
        return "Title: " + getTitle() + "\r\n" + "Author: " + getAuthor() + "\r\n" + "Genre" + getGenre() + "\r\n" + "Year of publication: " + getPublicationYear() + "\r\n" + "Number of pages: " + numberOfPages;
    }

    @Override
    public String toCount() 
    {
        return "Books in collection " + bookCounter;
    }

    public String toString() 
    {
        return "This is book in your collection";
    }
}
