import java.util.Scanner;

/*
	Player objects are created with this class
	Keeps track and handles the money of individual players
*/

public class Player
{
	/* Class variables */
	private int money;
	private static final int STARTING_AMOUNT = 100;
	private int bet;
	
	/* Constructor, initializes starting values */
	public Player()
	{
		money = STARTING_AMOUNT;
	}
	
	/* If a player makes a bet, store user input in some variable */
	public void playerBet()
	{
		Scanner userIn = new Scanner(System.in);
		System.out.println("\nEnter a value < 0 to exit the game\n");
		System.out.println("Enter your bet: ");
		bet = userIn.nextInt();
	}
	
	/* Add money to the respective player */
	public void addMoney(int value)
	{
		money += value;
	}
	
	/* Deduct money to the respective player */
	public void loseMoney(int value)
	{
		money -= value;
	}
	
	/* Return the value of the bet made */
	public int getBet()
	{
		return bet;
	}
	
	/* Return the current player's amount of money */
	public int getMoney()
	{
		return money;
	}
}
