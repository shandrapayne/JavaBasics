import java.util.Scanner;

public class ISBNChecksum {

    public static void main(String[] args) {
        String isbnstr, checksumVal, continueEnteringNums;
        int isbn, d1, d2, d3, d4, d5, d6, d7, d8, d9, checksum;
        Scanner input;

        input = new Scanner(System.in);
        continueEnteringNums = "yes";
        do {
            System.out.println("Enter the first 9 digits of the ISBN: ");
            isbnstr = input.next();

            if (isbnstr.length() < 9 || isbnstr.length() > 10) {
                System.out.println("You did not enter 9 digits.");
               
            } else {
                isbn = Integer.parseInt(isbnstr);

                d1 = isbn / 100000000;
                d2 = isbn / 10000000 % 10;
                d3 = isbn / 1000000 % 10;
                d4 = isbn / 100000 % 10;
                d5 = isbn / 10000 % 10;
                d6 = isbn / 1000 % 10;
                d7 = isbn / 100 % 10;
                d8 = isbn / 10 % 10;
                d9 = isbn % 10;

                checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8)
                        + (d9 * 9)) % 11;

                if (checksum >= 10) {
                    checksumVal = "X";
                } else {
                    checksumVal = String.valueOf(checksum);
                }

                System.out.println("The ISBN-10 is: " + isbnstr + checksumVal);

            }
            System.out.println("Do you want to enter another number? (yes or no) ");
            continueEnteringNums = input.next();

        } while (continueEnteringNums.equals("yes"));
        input.close();
    }
}
