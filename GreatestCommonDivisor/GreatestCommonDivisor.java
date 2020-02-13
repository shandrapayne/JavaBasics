import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int n1, n2, k, gcd;
        Scanner input = new Scanner(System.in);
        k = 2;
        gcd = 1;

        System.out.println("Let's find the common divisor for any 2 numbers.");
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        // check wether k is a common divisor for n1 & n2
        // until k is greater than n1 or n2
        while ((k <= n1) && (k <= n2)) {
            if ((n1 % k == 0) && (n2 % k == 0))
                gcd = k;
            k++;
        }

        System.out.println("The greatest common divisor for the numbers " + "\n" + n1 + " and " + n2 + " is: " + gcd);

        input.close();
    }
}
