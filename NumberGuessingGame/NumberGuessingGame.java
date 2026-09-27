import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void  main(String[] args){

        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        int secretNumber = random.nextInt(100) + 1;//nextInt(100) gives:

//0 to 99 becoz of loop index
        int guess;
        int attempts = 0;
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");
        while(true){
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct! 🎉");
                break;
            }
            else if (guess > secretNumber){
                System.out.println("Too high try again");
            }
            else {
                System.out.println("Too low! Try again");
                break;

            }
           System.out.println("you guessed it in" + attempts + " attempts.");
        }
        sc.close();
    }
}
