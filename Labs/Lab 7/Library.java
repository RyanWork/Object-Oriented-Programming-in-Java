import java.util.*;
/**
 * 
 * 
 * @Ryan Ha 
 * @Lab 2 
 */
public class Library
{
    // instance variables - replace the example below with your own
    private ArrayList<Book> books;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        books = new ArrayList<Book>();
    }
    
    public ArrayList<Book> getBooks()
    {
        return books;
    }
    
    public void addBook(Book b)
    {
        if(! books.contains(b)) books.add(b);
    }
    
    public void print()
    {
        for(Book list : books)
        {
            System.out.println(list.getTitle());
        }
    }
    
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Library)) return false;
        Library lib = (Library) obj;
        if (books.containsAll(lib.getBooks())) return true;
        else return false;
    }
}
