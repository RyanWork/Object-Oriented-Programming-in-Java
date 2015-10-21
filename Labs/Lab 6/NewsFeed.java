import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class NewsFeed
{
    private ArrayList<Post> posts;
    private ArrayList<MessagePost> comments;
    
    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<Post>();
    }

    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }

    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()
    {
        // display all posts
        for(Post post : posts) {
            post.display();
            System.out.println();   // empty line between posts
        }
    }
    
    public static void main(String args[])
    {
        NewsFeed testFeed = new NewsFeed();
        
        Post postNormal = new Post("Ryan");
        testFeed.addPost(postNormal);
        
        PhotoPost postPhoto = new PhotoPost("Tristan", "Picture", "Picture Test");
        testFeed.addPost(postPhoto);
        
        EventPost postEvent = new EventPost("Alex", "Fun");
        testFeed.addPost(postEvent);
           
        MessagePost postMessage = new MessagePost("Daman", "Hello World");
        MessagePost postMessage2 = new MessagePost("Joe", " Second comment!");
        
        CommentedPost postComment = new CommentedPost("Bob", "Wow so cool!");
        postComment.addComment(postMessage);
        postComment.addComment(postMessage2);
        testFeed.addPost(postComment);
        
        testFeed.show();
    }
}
