// Shandra Payne
package logicaloperatorsshandra;

import java.util.Scanner;


public class LogicalOperatorsShandra
{
    
    public static void main(String[] args)
    {
        int x;
        Scanner input;
        
        input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        x = input.nextInt();
        
        // check if number is divisible by 5 & 6
        if((x % 5 == 0) && (x % 6 == 0))
        {
            System.out.println("The number is evenly divisible by 5 and 6.");
        }
        // check if number is divisible by 5 OR 6
        if((x % 5 == 0) || (x % 6 == 0))
        {
            System.out.println("The number is divisible by 5 OR 6");
        }
        // check if number is divisible by 5 or 6 BUT NOT BOTH
        if((x % 5 == 0) ^ (x % 6 == 0))
        {
            System.out.println("The number is divisble by 5 or 6, but not both.");
        }
        
    }
    
}
