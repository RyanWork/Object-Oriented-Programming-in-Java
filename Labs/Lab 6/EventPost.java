
/**
 * Write a description of class EventPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EventPost extends Post
{
    // instance variables - replace the example below with your own
    private String event;

    /**
     * Constructor for objects of class EventPost
     */
    public EventPost(String author, String eventType)
    {
        super(author);
        event = eventType;
    }
    
    public String getEvent()
    {
        return event;
    }
    
    public String getContents()
    {
        return (super.getContents() + "\nDescription of the event: " + event);
    }
}
