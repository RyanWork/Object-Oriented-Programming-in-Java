import java.util.*;
/**
 * A user has an id, a taste, and keeps track of the documents it "likes".
 * Furthermore, a user is asked by the simulation to "act", which means for now 
 * to search for documents and to evaluate them: if the document's tag matches the user's taste
 * the user will "like" it, i.e., adds it to its list of liked documents.
 * 
 * @author babak
 * @version assign1
 */
public class User {
    private static int ID_COUNT = 0;
    private int id;
    protected String taste;
    protected Simulation sim;
    protected ArrayList<Document> likes;

    /** 
     * create a peer with the supplied simulation and taste. Set a unique identifier for this
     * document by using and incrementing the ID_COUNT.
     * Also create an empty list of "liked" documents. 
     */
    public User(Simulation sim, String s) {
        this.sim = sim;
        this.id = ID_COUNT++;
        taste = s;
        likes = new ArrayList<Document>();
    }

    /** return this user's id */
    public int getId() {
        return id;
    }
    
    /** return this user's taste */
    public String getTaste() {
        return taste;
    }
    
    /** to "like" a document means to add it to the list of liked documents */
    public void like(Document d) {
        likes.add(d); //not worrying about duplicates yet
    }
    
    /** 
     * return true if this user likes the supplied document
     */
    public boolean likes(Document d) {
        return likes.contains(d); //NOTE: relies on equals() behaving as intended
    }
    
    /** 
     * The user's action during one simulation stpe, consists, for now, of:
     * 1- searching the simulation for the top documents
     * 2- evaluation the documents: for now, "like" the document if its tag matches the taste
     */
    public void act() {
        ArrayList<Document> docs = sim.search();
        evaluate(docs);
    }
     
	/**
	 * Applies the Simulation's search method to return the documents array
	 */
    protected ArrayList<Document> search() {
        return sim.search();
    }
    
	/**
	 * Look if the user's taste matches any docs
	 * If it does match, add document to a liked list for the user
	 */
    protected void evaluate(ArrayList<Document> docs) {
        for (Document doc : docs) {
            if (doc.getTag().equals(taste)) like(doc);
        }
    }
	
	/**
	 * Return a string of the User object information
	 */
	public String toString()
	{
		return ("User" + getId() + " is into: " + getTaste() + " and currently likes: ");
	}
	
}
