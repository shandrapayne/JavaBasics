
import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {

    int magicNumber, guess, min, max;
    Scanner input;
   
    magicNumber = (int) (Math.random() * 101);
    min = 0;
    max = 100;

    input = new Scanner(System.in);
    System.out.println("Guess a magic number between 0 and 100");

    guess = -1;

      while (guess != magicNumber) {

        System.out.println("Enter your guess: ");
        guess = input.nextInt();

        if (guess == magicNumber) {
          System.out.println("You got it! The number is " + magicNumber);
        }

        else if ((guess > magicNumber) && (guess < max)) {
          System.out.println("Your guess is too high!");
        }

        else if ((guess < magicNumber) && (guess > min)) {
          System.out.println("Your guess is too low!");
        }

        else {
          System.out.println("Your guess does not fall within the range (0 -100) ");

      }

    }
    input.close();
  }
}
/* 
  The best way to test this without spending too much time:
    - make your first guess be 50
    - if it says it's too high then the number is between 0-49
    - if it says it's too low the number is between 51-100
    (and so on)
*/