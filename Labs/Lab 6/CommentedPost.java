import java.util.ArrayList;
/**
 * Write a description of class CommentedPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommentedPost extends Post
{
    // instance variables - replace the example below with your own
    private int likes;
    private ArrayList<MessagePost> comments;
    private String author;
    private String comment;
    
    /**
     * Constructor for objects of class CommentedPost
     */
    public CommentedPost(String author, String comment)
    {
        super(author);
        comments = new ArrayList<MessagePost>();
        this.comment = comment;
        likes = 0;
    }
    
     /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }
    
    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    
    public void addComment(MessagePost text)
    {
        comments.add(text);
    }
    
    public ArrayList<MessagePost> getComments()
    {
        return comments;
    }
    
    public void display()
    {
        System.out.println(this.getContents() + " - " + comment);
        System.out.print(super.timeString(super.getTimeStamp()));
        
        if(likes > 0) {
            System.out.println("  -  " + likes + " people like this.");
        }
        else {
            System.out.println();
        }

        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        }
        else{
            for(MessagePost comment : comments)
            {
                System.out.println("   " + comment.getContents() + " - " + super.timeString(super.getTimeStamp()));    
            }
        }
    }
}
