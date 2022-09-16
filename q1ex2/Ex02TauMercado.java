package q1ex2;
import java.util.Scanner;
public class EX02TauMercado{
	public static void main(String[] args){
		String option = "placeholder";
		int random, guess;
		int range = 10;
		int min = 1;
		int max = 10;
		int guesses = 3;
		Scanner response = new Scanner(System.in);
		String replay = "y";
		do{
			System.out.println("Welcome to Higher or Lower! What will you do?" + "\n-Start game\n-Change settings\n-End application");
			option = response.nextLine();
			if(option.equalsIgnoreCase("Start game")){
				replay = "y";
				while(replay.equalsIgnoreCase("y")){
					random = (int) Math.floor(Math.random()*range) + min;
					for(int guessesLeft=guesses ; guessesLeft>0; guessesLeft--){
						System.out.println("You have " + guessesLeft+ " guess(es) left. What is your guess?");
						guess = Integer.parseInt(response.nextLine());
						if(guess == random){
							System.out.println("You got it!");
							break;
						}
						else if(guess > random){
							if (guesses>1){
								System.out.println("Guess lower!");
							}
							else{
								System.out.println("You lost...");
							}
					  	}
						else if(guess < random){
							if (guesses>1){
								System.out.println("Guess higher!");
							}
							else{
								System.out.println("You lost...");
							}
						}
					}
					System.out.println("Play again (y/n)?");
					replay = response.nextLine();
					while(!replay.equalsIgnoreCase("y") && !replay.equalsIgnoreCase("n")){
						System.out.println("Please only answer y or n. ");
						System.out.println("Play again (y/n)?");
						replay = response.nextLine();
					}
				}
			}
			else if(option.equalsIgnoreCase("Change settings")){
				  System.out.println("What is the lower limit of the random number?");
				  min = Integer.parseInt(response.nextLine());
				  System.out.println("What is the upper limit of the random number?");
				  max = Integer.parseInt(response.nextLine());
				  range = max + 1 - min;
				  System.out.println("How many guesses are allowed?");
				  guesses = Integer.parseInt(response.nextLine());
			}
			else{
				System.out.println("Please check your spelling and try again!");
			}
		}while(!option.equalsIgnoreCase("End application"));
		System.out.println("Thank you for playing!");
	}
}
