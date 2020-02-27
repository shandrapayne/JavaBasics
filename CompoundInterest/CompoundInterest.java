import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {

    public static void main(String[] args) {
        double accountBalance, monthlySavingsAmount, annualInterestRate, monthlyInterestRate;
        int monthsSaved;
        Scanner input;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        input = new Scanner(System.in);

        System.out.println("Enter your monthly savings amount: (ie: 100.00)");
        monthlySavingsAmount = input.nextDouble();

        System.out.println("What is your annual interest rate? (ie: 15)");
        annualInterestRate = input.nextDouble();

        annualInterestRate = annualInterestRate / 100;
        monthlyInterestRate = annualInterestRate / 12;
        accountBalance = 0;

        for (monthsSaved = 1; monthsSaved < 7; monthsSaved++) {
            accountBalance = (monthlySavingsAmount + accountBalance) * (1 + monthlyInterestRate);
        }

        System.out.println("After 6 months your balance will be: $" + df.format(accountBalance));

    }

}
