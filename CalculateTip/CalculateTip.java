
import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculateTip
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double amountOfBill;
        int tipAmountDesired;
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
       
   
        tipAmountInDollars = calculateTip(amountOfBill, tipAmount);
        totalAmount = getTotalBill(amountOfBill, tipAmountInDollars);
    
        System.out.println("The amount of the tip is: $" + df.format(tipAmountInDollars) +
                "\n and the total bill is: $" + df.format(totalAmount));

    }
    
    public static double calculateTip(double billAmount, int gratuityRate) 
    {
        double tipAmountInDollars =  billAmount * gratuityRate / 100;
        return tipAmountInDollars;
       }

    public static double getTotalBill(double billAmount, double tipAmount)
    {
        double totalBill = billAmount + tipAmount;
        return totalBill;
    }
}
