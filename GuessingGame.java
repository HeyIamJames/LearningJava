import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public staic void main(String[] args) {
        
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000);
        int numberOfTries = 0;
        Scanner input = new Scanner (System.in);
        int guess;
        
        System.out.println("Guess a number 1-1000")
        guess = input.nextInt();
        numberOfTries++;
        
        if (guess == numberToGuess)(
        
        )
        else if (guess < numberToGuess)(
        
        )
    }
}
