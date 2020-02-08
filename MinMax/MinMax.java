
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class MinMaxShandra
{

    public static void main(String[] args)
    {

        int numberEntered, min, max, continueEnteringNumbers;
        String dialogInput;
        List<Integer> listOfNumbers;

        listOfNumbers = new ArrayList<>();

        do
        {

            dialogInput = JOptionPane.showInputDialog("Enter a number: ");
            numberEntered = Integer.parseInt(dialogInput);

            listOfNumbers.add(numberEntered);

            continueEnteringNumbers = JOptionPane.showConfirmDialog(null,
                    "Do you want to enter another number?");

        } while (continueEnteringNumbers == 0);

        min = Collections.min(listOfNumbers);
        max = Collections.max(listOfNumbers);

        JOptionPane.showMessageDialog(null, "Of the numbers you entered the smallest was: " + min + " and the largest was: " + max);
    }

}
