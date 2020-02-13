import java.util.Scanner;

public class UpperLimit {

    public static void main(String[] args) {
        int n;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = input.nextInt();

        while ((n >= 12 && n <= 27) || (n >= 57 && n <= 103))

        {
            System.out.println(n);
            n++;

        }

        input.close();
    }

}

/*
 * This was a code challenge given in class. The problem was: User inputs a
 * number (n) If n is one range (12 -27) OR (57 -103) then print the numbers up
 * to the upper limit of whatever range it was in.
 * 
 * Special thanks to my team: Janae & Anson
 * 
 * 
 */