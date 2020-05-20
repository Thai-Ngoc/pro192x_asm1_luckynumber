package pro192x_asm1;
import java.util.*;
public class LuckyNumber {
	public static void play() {
		int min = 0;
		int max = 100;
		int random = 0;
		int guess = -1;
		int count = 0;
		Scanner in = new Scanner(System.in);
		String answer = "yes";
		do {
			random = (int)(Math.random() * (max - min + 1) + min);
			System.out.println("I'm thinking of number between 1 and 100");
			do {
				count++;
				System.out.print("You guess? ");
				guess = in.nextInt();
				if (guess < random) {
					System.out.println("It's higher.");
				} else if (guess > random) {
					System.out.println("It's lower.");
				} else {
					System.out.println("You got it right in " + count + " guesses");
				}
			} while (guess != random);
			System.out.print("Do you want to play again? ");
			answer = in.next();
			
			System.out.println();
		} while (guess == random && answer == "yes");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play();
	}
}
