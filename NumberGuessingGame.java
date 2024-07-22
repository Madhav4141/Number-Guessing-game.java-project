package NumberGuessingGame;
import java.util.Scanner;
import java. util.Random;

public class task9 {

	public static void main(String[] args) {
		
		generateRandom();
		
	} 
	
	public static void generateRandom() {
		
		Random rand = new Random();
		
		randomNum = rand.nextInt(11);
		
		guess(randomNum);
		
		
	}
		
	
	public static void guees(int randomNum) { 
		Scanner in  = new Scanner(System.in);
		System.out.println( " ");
		System.out.println( "Number Guessing Game");
		System.out.println( "Guess a number between 0-10");
		
		int guess = in.nextInt();
		System.out.println( " ");
		while ( guess<0   ||  guess>10) {
			
			System.out.println( "Guess a number between 0-10:");
			guess = in.nextInt();
			System.out.println( " ");
			
		}
		
		 int tries = 0;
		 while(guees!=randomNum) {
			 tries++;
			 System.out.println( " Wrong Guess!");
			 System.out.println( "Guess again:");
			 guess = in.nextInt();
			 System.out.println(" ");
			 
			 while( guess<0 || guess>10) {
				 System.out.println(" Guess a ")
			 }
			 
		 }
		
	}
		
	}


