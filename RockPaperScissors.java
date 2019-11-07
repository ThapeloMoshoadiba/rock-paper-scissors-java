/*

04 August 2019
Thapelo Moshoadiba
Introduction to programming Task 2.1

Write a program that allows the user to play the rock, paper, scissors game
? The program should randomly generate a number 0, 1, 2, which represents scissors, rock and paper respectively.
? The program should then prompt the user to enter a number 0, 1, 2.
? Once the user has entered their number the program should inform them whether they win, lose or draw.
? The rules of the game are as follows:
  ? Scissors beats paper
  ? Rock beats scissors
  ? Paper beats rock

*/

package rpsgame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String args[]) {
		
		// 0 = Rock , 1 = Paper , 2 = Scissors
		
		Random rand = new Random();
		int rand_int = rand.nextInt(3);
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter 0, 1, or 2: ");
		int user_number = reader.nextInt();
		
		reader.close();
		
		if (user_number == rand_int)
			System.out.println("Draw");
		
		else if ( (user_number == 0) & (rand_int == 1) )
			System.out.println("You Lose");
		
		else if ( (user_number == 0) & (rand_int == 2) )
			System.out.println("You Win");
			
		else if ( (user_number == 1) & (rand_int == 0) )
			System.out.println("You Win");
		
		else if ( (user_number == 1) & (rand_int == 2) )
			System.out.println("You Lose");
		
		else if ( (user_number == 2) & (rand_int == 0) )
			System.out.println("You Lose");
		
		else if ( (user_number == 2) & (rand_int == 1) )
			System.out.println("You Win");
	}

}
