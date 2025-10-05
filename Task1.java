import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int maxAttempt=10;
        int totalScore;
        char playAgain;

        do{
            int randNum=rand.nextInt(100)+1;
            int attempt;
            System.out.println("\nNew Round");
            System.out.println("Guess number from 1 to 100. You have "+maxAttempt+" attempts");

            for(attempt=1; attempt<=maxAttempt; attempt++){
                System.out.print("Enter your number: ");
                int userGuess=sc.nextInt();

                if(userGuess==randNum){
                    System.out.println("\nCorrect! You guessed the number in "+attempt+" attempts");
                    break;
                }
                else if(userGuess>randNum){
                    System.out.println("Too high");
                }
                else{
                    System.out.println("Too low");
                }
            }

            if(attempt>maxAttempt){
                System.out.println("Game over! The number was: "+randNum);
                attempt=maxAttempt+1;   //ensure roundscore is 0
            }

            int roundScore=(attempt<=maxAttempt)?(maxAttempt-attempt+1):0;
            totalScore=roundScore;
            System.out.println("Score for this round: "+roundScore);
            System.out.println("Total score is: "+totalScore);

            System.out.print("\nDo you want to play again? type (y/n) y-->Yes, n-->No: ");
            playAgain=sc.next().charAt(0);
        } while(playAgain=='y' || playAgain=='Y');

        System.out.println("Thank you for playing! Your final score is: "+totalScore);
        sc.close();
    }
}
