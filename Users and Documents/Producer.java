
/**
 * Producers act by creating a document and matching the taste,
 * Searching and evaluating the documents
 *
 * @author Ryan Ha
 * @version assign2
 */
 
 public class Producer extends User
 {
	 /**
	  * Producer constructor
	  */
	public Producer(Simulation sim, String taste)
	{
		super(sim, taste);
	}
	
	/**
	 * Overriding act method, applies super act and creates a new document
	 */
	public void act()
	{
		Document proDoc = new Document(super.taste);
		sim.addDocument(proDoc);
		super.act();
	}
	
	/**
	 * Return a string of the object information
	 */
	public String toString()
	{
		return "Producer User" + getId() + " is into: " + getTaste() + " and currently likes " + likes + "\n";
	}
 }