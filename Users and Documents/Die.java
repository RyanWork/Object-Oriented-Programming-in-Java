import java.util.Random;
/*
	Class to generate a random roll
*/
public class Die
{
	/* Class Variables */
	private static final int USERMAX_NUM = 2;
	private static final int USERMIN_NUM = 1;
	private static final int TASTEMAX_NUM = 2;
	private static final int TASTEMIN_NUM = 0;
	private Random rand;
	
	/* Method to randomly generate a number */
	public int roll(int max, int min)
	{
		rand = new Random();
		int randNum = rand.nextInt((max-min) + min) + min;
		return randNum;
	}
	
	/**
	 * Return if the user is a producer or consumer
	 * Rolls a number between 1 and 2
	 * If 1 create a producer otherwise create a consumer
	 */
	public User chooseUser(Simulation sim, String taste)
	{
		int newNum = roll(USERMAX_NUM, USERMIN_NUM);
		if(newNum == 1) return new Producer(sim, taste);
		else return new Consumer(sim,taste);
	}
	
	/**
	 * Return a random number to determine position in Taste Array
	 * Rolls a number between 0 and 2 with associative values in array
	 */
	public int chooseTaste()
	{
		return roll(TASTEMAX_NUM, TASTEMIN_NUM);
	}
}