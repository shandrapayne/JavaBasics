import java.util.Scanner;

public class AddMeTogether {

  public static void main(String[] args) {
    Scanner input;
    int initialNumber, numberToAdd, total, numberCount;
    String desireToAddMoreNumbers;
    boolean keepPlaying;

    input = new Scanner(System.in);

    System.out.printf("  Welcome to Add Me Together!" + "\n I'm going to add all the numbers you enter. Let's begin."
        + "\n Please enter a number: ");

    initialNumber = input.nextInt();

    keepPlaying = true;

    numberToAdd = 0;

    // there's at least 1 number now
    numberCount = 1;

    // set the initalNumber as total for now
    total = initialNumber;

    // do while loop (work always will happen once)
    do {
      // see if they want to enter another number
      System.out.printf(" Do you want to enter another number? ");
      desireToAddMoreNumbers = input.next();

      // if no, and only one number has been put in tell user the rules and give
      // them another chance to enter another number. if still no,
      // then exit and stop wasting the programs time.
      if ((desireToAddMoreNumbers.equalsIgnoreCase("no")) && (numberCount < 2)) {
        System.out.printf(" You need to enter at least 2 numbers to play."
            + "\n Do you want to enter another number to keep playing? ");
        desireToAddMoreNumbers = input.next();

        if (desireToAddMoreNumbers.equalsIgnoreCase("no")) {
          keepPlaying = false;
          System.out.println(" Ok. Come back when you are ready to play.");
          System.exit(1);
        }
      } else if (desireToAddMoreNumbers.equalsIgnoreCase("no")) {
        // they have entered at least 2 numbers but want to end now
        // so exit the loop to display total
        keepPlaying = false;
      }

      else {
        // total set to initialNumber, get numberToAdd
        System.out.printf(" Enter another number: ");
        numberToAdd = input.nextInt();

        // increase numberCount
        numberCount++;

        // calculate total
        total += numberToAdd;
      }

    } while (keepPlaying);

    System.out.println(" The total of the numbers you entered is: " + total);

    // close Scanner
    input.close();
  }
}