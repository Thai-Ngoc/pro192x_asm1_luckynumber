package pro192x_asm1;
import java.util.*;
public class LuckyNumber {
	public static final int MAX = 100; //instance variables
	private static Scanner input; //instance variables, get user input
	public static int play() {
		int lucky = 0; //local variables, store the value of lucky number
		int guess = 0; //local variables, store the value of predictive number
		int count = 0; //local variables, store the value of guesses in each game 
		input = new Scanner(System.in); 
		
		lucky = (int)(Math.random() * (MAX + 1)); //random a number
		System.out.println("I'm thinking of number between 1 and 100");
		do {
			//this loop will run until the lucky number is found out
			count++;
			System.out.print("You guess? ");
			if (input.hasNextInt()) {
				// Check input is number with hasNextInt()
				guess = input.nextInt();
				if (guess < lucky) {
					//when predictive number smaller than lucky number
					System.out.println("It's higher.");
				} else if (guess > lucky) {
					//when predictive number greater than lucky number
					System.out.println("It's lower.");
				} else {
					//when the lucky number is found out
					System.out.println("You got it right in " + count + " guesses");
				}
			} else {
				System.out.println("Please enter a number");
				input.next();
			}
		} while (guess != lucky);
		return count;
	}
	
	public static void report(int minGame, int totalGame, int totalGuess) {
		// Function to show summary after end game
		System.out.println("Overall result:");
		System.out.println("Total game = " + totalGame);
		System.out.println("Total gueses = " + totalGuess);
		System.out.println("Guesses/game = " + (double)(totalGuess / totalGame));
		System.out.println("Best game = " + minGame);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = ""; //local variables
		int totalGame = 0; //local variables, store the number of games played
		int minGame = Integer.MAX_VALUE; //local variables, declare with the default maximum integer
		int totalGuess = 0; //local variables, store the number of total guesses
		input = new Scanner(System.in); 
		do {
			//this loop repeats the game until the user do not want to play anymore
			totalGame++;
			int currentGuess = play(); //get the value of variable count of current game, 
			totalGuess += currentGuess; //update totalGuess
			if (minGame > currentGuess) {
				//compare to minGame to find out the minimum, find out the best game
				minGame = currentGuess;
			}
			System.out.print("Do you want to play again? ");
			answer = input.next().toLowerCase();
			System.out.println();
		} while (answer.equals("yes") || answer.equals("y"));
		report(minGame, totalGame, totalGuess); //method report() is called to print out the summary
	}
	
	
	
	
}
