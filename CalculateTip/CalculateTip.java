
import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculateTip
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double amountOfBill;
        double tipAmountDesired;
        double tipAmountInDollars;
        double totalAmount;
        DecimalFormat df = new DecimalFormat();

         // decimal format
         df.setMinimumFractionDigits(2);
         df.setMaximumFractionDigits(2);
         df.setGroupingUsed(true);
         df.setGroupingSize(3);
    
        System.out.println("Enter the amount of your bill ( ie: 25.00 ) : ");
        amountOfBill = input.nextDouble();
       
        System.out.println("What percentage would you like to tip ( ie: 15) ? ");
        tipAmountDesired = input.nextDouble() / 100;
        
        tipAmountInDollars = tipAmountDesired * amountOfBill;
        totalAmount = tipAmountInDollars + amountOfBill;

        df.setMinimumFractionDigits(2);
    
        System.out.println("The amount of the tip is: $" + df.format(tipAmountInDollars) +
                "\n and the total bill is: $" + df.format(totalAmount));

        input.close();
    }
    
}
