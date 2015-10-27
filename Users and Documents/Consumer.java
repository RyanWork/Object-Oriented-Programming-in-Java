
/**
 * Consumers are very similar to the already existing
 * User class and objects
 *
 * @author Ryan Ha
 * @version assign2
 */
 
 public class Consumer extends User
 {
	 /**
	  * Consumer constructor
	  */
	 public Consumer(Simulation sim, String taste)
	 {
		 super(sim, taste);
	 }
	 
	 /**
	  * Return string of object information
	  */
	 public String toString()
	 {
		 return "Consumer User" + getId() + " is into: " + getTaste() + " and currently likes " + likes + "\n";
	 }
 }