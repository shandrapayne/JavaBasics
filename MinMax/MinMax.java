import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        int numberEntered, min, max;
        String continueEnteringNumbers;
        List<Integer> listOfNumbers;
        Scanner input;
        listOfNumbers = new ArrayList<>();

        input = new Scanner(System.in);

        continueEnteringNumbers = "yes";
        do {

            System.out.println("Enter a number: ");
            numberEntered = input.nextInt();

            listOfNumbers.add(numberEntered);

            System.out.println("Do you want to enter another number? (yes or no)");
            continueEnteringNumbers = input.next();

        } while (continueEnteringNumbers.equals("yes"));

        min = Collections.min(listOfNumbers);
        max = Collections.max(listOfNumbers);

        System.out.println("Of the numbers you entered the smallest was: " + min + " and the largest was: " + max);

        input.close();
    }

}
