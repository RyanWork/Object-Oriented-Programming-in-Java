import java.util.Random;
import java.util.Scanner;

/*
	Class to generate a random roll
*/
public class Die
{
	/* Class Variables */
	private static final int MAX_NUM = 6;
	private static final int MIN_NUM = 1;
	private Random rand;
	
	/* Method to randomly generate a number */
	public int roll()
	{
		rand = new Random();
		int randNum = rand.nextInt((MAX_NUM-MIN_NUM) + MIN_NUM) + MIN_NUM;
		System.out.println(randNum);
		return randNum;
	}	
	
	/* Main Method */
	public static void main(String args[])
	{
		Die rollTest = new Die();
		rollTest.roll();
	}
}