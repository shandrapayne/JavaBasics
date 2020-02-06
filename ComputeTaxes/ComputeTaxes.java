
import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeTaxes
{

    public static void main(String[] args)
    {
        // create variables
        Scanner input = new Scanner(System.in);
        int status;
        double income;
        double tax;
        DecimalFormat df = new DecimalFormat();

        // prompt user for filing status
        System.out.print(" 0 - single filer, "
                + "\n 1 - married jointly or qualifying widow(er),"
                + "\n 2 - married filing separately,"
                + "\n 3 - head of household"
                + "\n Enter your status: ");
        status = input.nextInt();
        
        // check for invalid status entry & exit if invalid
        if (status > 3)
        {
            System.out.println("ERROR: Invalid status entry." +
                    "\n Please run program again and enter a valid status.");
            System.exit(1);
        }

        // prompt user to enter taxable income
        System.out.println("Enter taxable income: ");
        income = input.nextDouble();

        // decimal format
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        df.setGroupingUsed(true);
        df.setGroupingSize(3);

        // compute tax
      tax = 0;

        switch (status)
        {
            case 0: // compute for single tax filers
                if (income <= 8350)
                {
                    tax = income * 0.10;
                } else if (income <= 33950)
                {
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                } else if (income <= 82250)
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (income - 33950) * 0.25;
                } else if (income <= 171550)
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                } else if (income <= 372950)
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                            + (income - 171550) * 0.33;
                } else
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                            + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                }
                break;
            case 1: // married filing jointly or qualifying widower
                if (income <= 16700)
                {
                    tax = income * 0.10;
                } else if (income <= 67900)
                {
                    tax = 16700 * 0.10 + (income - 16700) * 0.15;
                } else if (income <= 137050)
                {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (income - 67900) * 0.25;
                } else if (income <= 208850)
                {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
                } else if (income <= 372950)
                {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                            + (income - 208850) * 0.33;
                } else
                {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                            + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
                }
                break;
            case 2: // married filing separately
                if (income <= 8350)
                {
                    tax = income * 0.10;
                } else if (income <= 33950)
                {
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                } else if (income <= 68525)
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (income - 33950) * 0.25;
                } else if (income <= 104425)
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
                } else if (income <= 186475)
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                            + (income - 104425) * 0.33;
                } else
                {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                            + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
                }
                break;
            case 3: // head of household
                if (income <= 11950)
                {
                    tax = income * 0.10;
                } else if (income <= 45500)
                {
                    tax = 11950 * 0.10 + (income - 11950) * 0.15;
                } else if (income <= 117450)
                {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (income - 45500) * 0.25;
                } else if (income <= 190200)
                {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
                } else if (income <= 372950)
                {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                            + (income - 190200) * 0.33;
                } else
                {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                            + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
                }
                break;
            default:
                System.out.println("Error: invalid entry");
                System.exit(1);
        }

        // display result
        System.out.println("Tax is $" + df.format((int) (tax * 100) / 100.0));

        //close input
        input.close();
    }

}

/*
      income test cases I used:

            for (0) single filer: 

              $40,000    (income <= 82250) 
              tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (40000 - 33950) * 0.25
              tax = (8350 * 0.10) + (25600 * 0.15) + (6050 * 0.25)
              tax = 835 + 3840 + 1512.5
              tax = 6187.5
              tax = $6,187.50
                     

            for (1) married filing jointly: 
              $250,000    (income <= 372950)
               tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                            + (250000 - 208850) * 0.33
               tax = (16700 * 0.10) + (51200 * 0.15)
                            + (69150 * 0.25) + (71800 * 0.28)
                            + (41150 * 0.33)
               tax = 1670 + 7680 + 17287.5 + 20104 + 13579.5         
               tax = 60341
               format tax = $60,341.00


            for (2) married filing separately: 
              $112,000 (income <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                            + (112000 - 104425) * 0.33
                tax = (8350 * 0.10) + (25600 * 0.15)
                            + (34575 * 0.25) + (35900 * 0.28)
                            + (7575 * 0.33)
                tax = 835 + 3840 + 8643.75 + 10052 + 2499.75
                tax = 25870.5
                format tax = $25,870.50

            for (3) head of household: 
              $360,000 (income <= 372950)
              tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                            + (360000 - 190200) * 0.33
              tax = (11950 * 0.10) + (33550 * 0.15)
                            + (71950 * 0.25) + (72750 * 0.28)
                            + (169800 * 0.33)
              tax = 1195 + 5032.5 + 17987.5 + 20370 + 56034
              tax = 100619
              format tax = $100,619.00

 */
