import java.util.Scanner;

public class FractionOOP
{

   
    public static void main(String[] args)
    {
        int c;
        boolean q;
        Scanner input; 
        
        q = true;
        input = new Scanner(System.in);
        
        Fraction[] frs = 
                {
                    new Fraction(),
                    new Fraction(12, 18), 
                    new Fraction(12, 0),
                    new Fraction(-6, -2),
                    new Fraction(85, -50)
                };
       
       do 
       {
           System.out.println("Select an option: ");
           System.out.println("1.) display fraction");
           System.out.println("2.) reduce fraction");
           System.out.println("3.) display fraction as a mixed number");
           System.out.println("4.) display decimal version of the fraction");
           System.out.println("5.) quit");
           
           c = input.nextInt();
           
           for (Fraction fr : frs) 
           {
               switch(c) 
               {
                   case 1:
                       System.out.println(fr.toString());
                       System.out.println("");
                       break;
                   case 2:
                       fr.reduce();
                       break;
                   case 3:
                       System.out.println(fr.toMixed());
                       System.out.println("");
                       break;
                   case 4:
                       System.out.println(fr.getDecimal());
                       System.out.println("");
                       break;
                   case 5:
                       q = false;
                       break;
                   default:
                       System.out.println("Invalid input.");
                       break;
               }
           }
       } while (q);
    }
}