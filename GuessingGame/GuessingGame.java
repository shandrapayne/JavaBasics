import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {

    int magicNumber, guess, min, max;
    Scanner input;
    String highOrLow;

    // generate magicNumber between 0 - 100
    magicNumber = (int) (Math.random() * 101);

    // set min and max
    min = 0;
    max = 100;

    input = new Scanner(System.in);
    System.out.println("Guess a magic number between 0 and 100");

    guess = -1;

    try {
      // loop
      while (guess != magicNumber) {

        // prompt user to enter a number
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
          InvalidInputException outOfRange = new InvalidInputException(
              "The number you entered is not between 0-100. Follow directions!");
          throw outOfRange;
        }

      }
    } // end of try

    catch (InvalidInputException e) {
      e.printStackTrace();
    }

  }
}