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
        
        // input for getting amountOfBill 
        System.out.println("Enter the amount of your bill ( ie: 25.00 ) : ");
        amountOfBill = input.nextDouble();
       
        // input for getting amountToTipPercentage (%) & convert to decimal
        System.out.println("What percentage would you like to tip ( ie: 15) ? ");
        tipAmountDesired = input.nextDouble() / 100;
        
        // calculate the tipAmountInDollars 
        tipAmountInDollars = tipAmountDesired * amountOfBill;
        
        // calculate totalAmount 
        totalAmount = tipAmountInDollars + amountOfBill;
        
        // set the format for printing tipAmountInDollars and totalAmount
        df.setMinimumFractionDigits(2);
        
        // display tipAmount and totalAmount
        System.out.println("The amount of the tip is: $" + df.format(tipAmountInDollars) +
                "\n and the total bill is: $" + df.format(totalAmount));

        // close Scanner
        input.close();
    }
    
}
