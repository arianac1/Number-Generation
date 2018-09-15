import java.util.Scanner; 
import java.util.Random;
public class Guess
{
	public static void main(String[] args)
	{
		int numToGuess; //Number the user tries to guess
		int guess; //The user's guess
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		numToGuess = generator.nextInt(10)+1;//randomly generate the number to guess
		
		System.out.println("Enter guess between 1 and 10:");//print message asking user to enter a guess
		
		guess = scan.nextInt();//read in guess
		
		while (guess != numToGuess ) //keep going as long as the guess is wrong
		{
			 count++;
			System.out.println("Try again");//print message saying guess is wrong
			guess = scan.nextInt();//get another guess from the user
						
			if (guess == numToGuess)
				System.out.println();
			else			
				if(guess < numToGuess)
				{	System.out.println("Too low");}
				else 
				{
			     	System.out.println("Too high");}
		}			
				
		System.out.println("Congratulations you guessed right!" + "\nNumber of guesses:" + count++);//print message saying guess is right
	}
}


