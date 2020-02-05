import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CompoundInterest
{

    public static void main(String[] args)
    {
        double accountBalance;
        double monthlySavingsAmount;
        double annualInterestRate;
        double monthlyInterestRate;
        String dialogInput;
        int monthsSaved;
        DecimalFormat df = new DecimalFormat();
        
        
        dialogInput = JOptionPane.showInputDialog("Enter your monthly savings amount: (ie: 100.00");
        monthlySavingsAmount = Double.parseDouble(dialogInput);
       
        dialogInput = JOptionPane.showInputDialog("What is your annual interest rate? (ie: 15)");
        annualInterestRate = Double.parseDouble(dialogInput);
        annualInterestRate = annualInterestRate / 100;
       
        monthlyInterestRate = annualInterestRate / 12;
        
        accountBalance = 0;
        
        df.setMaximumFractionDigits(2);
        
        for(monthsSaved = 1; monthsSaved < 7 ; monthsSaved++)
        {
           accountBalance = (monthlySavingsAmount + accountBalance) * (1 + monthlyInterestRate);
        }
         
        JOptionPane.showMessageDialog(null, "After 6 months your balance will be: $" + df.format(accountBalance));
     
    }
    
}
