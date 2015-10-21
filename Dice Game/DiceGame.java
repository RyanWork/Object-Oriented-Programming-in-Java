import java.util.Scanner;
import java.util.Random;

/*
	Class to play the entire Dice Game
*/

public class DiceGame
{
	/* Class Variables */
	private Die dice;
	private Player p1;
	private Player AI;
	
	/* Constructor, initializes starting values */
	public DiceGame()
	{
		dice = new Die();
		p1 = new Player();
		AI = new Player();
	}
	
	/* Method to start playing the game */
	public void play()
	{	
		/* Declare some comparator variables */
		boolean betInvalid;
		boolean continuePlay = true;
		
		/* Main loop */
		while(continuePlay)
		{
			betInvalid = true;
			
			/* Secondary Loop */
			do
			{	
				/* Print out player standings and make a new bet */
				System.out.println("You currently have: " + p1.getMoney());
				System.out.println("\nThe AI currently has: " + AI.getMoney());
				p1.playerBet();
			
				/* Check player input */
				//If the user makes a bet that is greater than their current money
				if (p1.getBet() > p1.getMoney())
				{
					System.out.println("That is not a valid bet\n");
				}
				
				//If the user makes a negative bet, quit the program
				else if(p1.getBet() < 0)
				{
					System.out.println("Thanks for playing");
					System.exit(0);
				}
				//If the user makes a valid bet
				else
				{
					System.out.println("Good luck\n");
					betInvalid = false;
				}
			}while(betInvalid); //Loop back to Secondary Loop
			
			/* Create two randomly generated values */
			int roll1 = dice.roll();
			int roll2 = dice.roll();
				
			/* Print out player rolls */
			System.out.println("You rolled: " + roll1);
			System.out.println("\nThe AI rolled: " + roll2 + "\n");
			
			/* Check who wins the game */
			// If the player beats the AI
			if (roll1 > roll2)
			{
				System.out.println("Congratulations you won\n");
				p1.addMoney(p1.getBet());
				AI.loseMoney(p1.getBet());
			}
			//If the AI beats the player
			else if (roll1 < roll2)
			{
				System.out.println("Sorry you lost\n");
				p1.loseMoney(p1.getBet());
				AI.addMoney(p1.getBet());
			}
			//If both values rolled are the same
			else
			{
				System.out.println("It was a tie!\n");
			}
			
			/* Check if the game is over */
			// If the player has no money
			if (p1.getMoney() <= 0)
			{
				System.out.println("Sorry, you're out of money! You lose!");
				System.exit(0);
			}
			//If the AI has no money
			else if(AI.getMoney() <= 0)
			{
				System.out.println("Congratulations you won! The AI has no more money. Thanks for playing!");
				System.exit(0);
			}
			//Both users have enough money to continue playing
			else
			{
				System.out.println("Would you like to keep playing?\n");
			}
		} //Loop back to Main loop
	}
	
	/* Main Method */
	public static void main(String args[])
	{	
		DiceGame game = new DiceGame();
		System.out.println("Let's play!\n");
		game.play();
		
	}
}