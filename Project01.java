import java.util.Scanner;
import java.util.Random;
//Number guessing game...
public class Project01 {
    public static void main(String[]args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int number = rand.nextInt(200)+1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to number guessing game");
        System.out.println("Guess a number between 1 to 200");

        while(guess != number){
            System.out.println("Enter the number:- ");
            guess = sc.nextInt();
            attempts++;
        
        if(attempts == 5) {
            System.out.println(" Game Over !!! " + ("The correct guess is  ") + number);
        }

        
        if(guess>number) {
            System.out.println("Too High!");
        }
        else if(guess<number) {
            System.out.println("Too Low!");
        }
        else{
            System.out.println("Correct! you guess it right " + attempts + " attempts " + " You won!!!");
        }
      }
    }
}
