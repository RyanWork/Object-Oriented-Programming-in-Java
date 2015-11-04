
/**
 * Write a description of class Ebooks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ebooks extends Book
{
    String fileType;
    public Ebooks(Writer bookAuthor, String bookTitle, int bookPages, String fileType)
    {
       super(bookAuthor, bookTitle, bookPages);
       this.fileType = fileType;
    }
    
    public String toString()
    {
        return "E-" + super.toString() + ", File type: "+fileType;
    }
    
    public boolean equals(Object item)
    {
        if (!(item instanceof Ebooks)) return false;
        Ebooks check = (Ebooks) item;
        if (check.getAuthor() == this.getAuthor() && check.getTitle() == this.getTitle()) return true;
        else return false;
    }
}
