
package computebmi;

import java.util.Scanner;
import java.text.DecimalFormat;


public class ComputeBmi
{

 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double weightInPounds;
        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        double weightInKilograms;
        double heightInInches;
        final double METERS_PER_INCH = 0.0254; 
        double heightInMeters;
        double bmi;
        DecimalFormat df = new DecimalFormat();
        
        // prompt the user for weight
        System.out.println("Enter your weight in lbs: ");
        weightInPounds = input.nextDouble();
        
        // calculate weight in kilograms
        weightInKilograms = weightInPounds * KILOGRAMS_PER_POUNDS;
        
        // prompt the user for height
        System.out.println("Enter your height in inches: ");
        heightInInches = input.nextDouble();
        
        // calculate height in meters
        heightInMeters = heightInInches * METERS_PER_INCH;
        
        // calculate BMI
        bmi = weightInKilograms /
            (heightInMeters * heightInMeters);
        
        // display result
         df.setMaximumFractionDigits(2);
        
        System.out.println("Your BMI is: " + df.format(bmi));
        
        if (bmi < 18.5 ) 
        {
            System.out.println("\n You are underweight");
        }
        else if ( bmi < 25 )
        {
            System.out.println("\n You are normal. Yay!");
        }
        else if ( bmi < 30 )
        {
            System.out.println("\n You are overweight");
        }
        else 
            System.out.println("\n You are obese");
    }
    
}
