import java.util.*;

/**
 * A simulation consists for now of a list of users and a list of documents. 
 * "Running" the simulation consists of iterating through the users and asking
 * them to "act". 
 * The simulation also provides a search method to the users 
 * so they can retrieve the top documents.
 * 
 * @author babak
 * @version assign1
 */
public class Simulation {
    
    private ArrayList<User> users;
    private ArrayList<Document> documents;
	private int numUsers;
	private int numDocuments;
	private static final String[] tasteArray = {"rock", "jazz", "rap"};
	private static final int DEFAULT_NUM = 0;

    /**
     * Initialize the simulation with empty lists of users and documents
     */
    public Simulation() {
        users = new ArrayList<User>();
        documents = new ArrayList<Document>();
		numUsers = DEFAULT_NUM;
		numDocuments = DEFAULT_NUM;
    }
	
	/**
	 * A more complicated constructor that takes a specific number of 
	 * users and documents.
	 */
	public Simulation(int nbUsers, int nbDocs)
	{
		this();
		numUsers = nbUsers;
		numDocuments = nbDocs;
	}
    
    /**
     * add the supplied user to the list of users
     */
    public void addUser(User u) {
        users.add(u);
    }
    
	/**
	 * Return a string of the simulation components
	 */
	public String toString()
	{
		String listOfUsers = "";
		for (User list : users)
		{
			listOfUsers = listOfUsers.concat(list.toString() + "\n");
		}
		return listOfUsers;
	}
	
    /**
     * add the supplied document to the list of documents
     */
    public void addDocument(Document d) {
        documents.add(d);
    }
    
    /** 
     * return top documents according to some strategy. 
     * For now just return them all! 
     */
    public ArrayList<Document> search() {
        return documents;
    }
    
    /** 
     * A simulation run consists of:
     * 1- pick a user (for now just pick them in order from the list)
     * 2- get the user to act
     */
    public void run() {
        for (User u: users) {
			u.act();
        }
		System.out.println(toString());
    }
     
	/**
	 * Main method to test the functionality of Simulation
	 */
	public static void main (String args[])
	{
		//Instantiate a new Simulation
		Simulation newSim = new Simulation(3, 4);
		
		//Instantiate a new object to randomize a value
		Die random = new Die();
		
		//Add all the users to the array list
		for(int i = DEFAULT_NUM; i < newSim.numUsers; i++)
		{
			User newUser = random.chooseUser(newSim, tasteArray[random.chooseTaste()]);
			newSim.addUser(newUser);
		}
		
		//Add all the documents to the array list
		for(int j = DEFAULT_NUM; j < newSim.numDocuments; j++)
		{
			Document newDoc = new Document(tasteArray[random.chooseTaste()]);
			newSim.addDocument(newDoc);
		}
		
		//Run the Simulation
		newSim.run();
	}
}
