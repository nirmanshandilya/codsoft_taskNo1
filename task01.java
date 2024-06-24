//task01: number game
import java.util.Scanner;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            int lowerlimit = 1;
            int upperlimit = 100;
            int maxattempts = 5;
            
            int score = 0;
            
            System.out.println("This is the Number Guessing Game made by Nirman Shandilya");
            System.out.println("I have chosen a number between " + lowerlimit + " and " + upperlimit + ".");
            System.out.println("You have " + maxattempts + " attempts to guess it.");
            
            boolean retry = true;
            while (retry) {
                int mynum = random.nextInt(upperlimit - lowerlimit + 1) + lowerlimit;
                int attempts = 0;
                
                while (attempts < maxattempts) {
                    System.out.print("Enter your guess: ");
                    int userguess = scanner.nextInt();
                    
                    if (userguess == mynum) {
                        System.out.println("Congratulations! You guessed the number.");
                        score++;
                        break;
                    } else if (userguess < mynum) {
                        System.out.println("The number is greater than you think.");
                    } else {
                        System.out.println("The number is less than you think.");
                    }
                    attempts++;
                }
                
                if (attempts==maxattempts) {
                    System.out.println("Oops! Your attempts are over. The actual number was " + mynum + ".");
                }
                
                System.out.print("Do you want to play again? (yes/no): ");
                String retryinput = scanner.next().toLowerCase();
                retry = retryinput.equals("yes");
            }
            
            System.out.println("Your final score: " + score);
        }
        System.out.println("Thanks for playing!");
    }
}
