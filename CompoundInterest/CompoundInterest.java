import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {

    public static void main(String[] args) {
        double accountBalance, monthlySavingsAmount, annualInterestRate;
        int monthsSaved;
        Scanner input;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        input = new Scanner(System.in);

        System.out.println("Enter your monthly savings amount: (ie: 100.00)");
        monthlySavingsAmount = input.nextDouble();

        System.out.println("What is your annual interest rate? (ie: 15)");
        annualInterestRate = input.nextDouble();

        System.out.println("How many months have you saved?");
        monthsSaved = input.nextInt();

        accountBalance = compoundInterest(monthsSaved, monthlySavingsAmount, annualInterestRate);
        
        System.out.println("After " + monthsSaved + " months your balance will be:  " + df.format(accountBalance));

    }



    public static double compoundInterest(int months, double savingsPerMonth, double apr)
    {
        double accountBalance;
    
        accountBalance = 0;
        while (months != 0) 
        {
            accountBalance = (accountBalance + savingsPerMonth) * (1 + (apr /100) /12);
            months--;
        }

        return accountBalance;
    }




}
