import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);
        boolean win = false;
        System.out.println("Type a number to make a guess");
        while(win == false){
            int guess = scanner.nextInt();
            if(guess == rnd_number){
                win = true;
                System.out.println("Correct! You win! The prize is... nothing!");
            }else {
                System.out.println("Wrong!");
            }

        }
    }
}