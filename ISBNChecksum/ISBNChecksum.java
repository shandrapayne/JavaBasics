
import javax.swing.JOptionPane;

public class ISBNChecksum {

    public static void main(String[] args)
    {
        String checksumVal, dialogInput;
        int isbn, d1, d2, d3, d4, d5, d6, d7, 
            d8, d9, continueEnteringNums, checksum;

        do 
        {
            dialogInput = JOptionPane.showInputDialog("Enter the first 9 digits of the ISBN: ");
            
            if (dialogInput.length() < 9 || dialogInput.length() > 10)  
            {
                JOptionPane.showMessageDialog(null, "You did not enter 9 digits.");
            }
            else 
            {
                isbn = Integer.parseInt(dialogInput);
                
                d1 = isbn / 100000000; 
                d2 = isbn / 10000000 % 10;
                d3 = isbn / 1000000 % 10;
                d4 = isbn / 100000 % 10;
                d5 = isbn / 10000 % 10;
                d6 = isbn / 1000 % 10;
                d7 = isbn / 100 % 10;
                d8 = isbn / 10 % 10;
                d9 = isbn % 10;
                
                checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + 
                            (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
                
                if (checksum >= 10) 
                {
                    checksumVal = "X";
                }
                else 
                {
                    checksumVal = String.valueOf(checksum);
                }

                JOptionPane.showMessageDialog(null, "The ISBN-10 is: " + dialogInput + checksumVal);
            }
            continueEnteringNums = JOptionPane.showConfirmDialog(null,
                               "Do you want to enter another number?");
       
    } while (continueEnteringNums == 0);
  }
}
