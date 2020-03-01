
import java.util.Scanner;


public class TriangleMethods
{

   
    public static void main(String[] args)
    {
        double tside1, tside2, tside3, triArea;
        boolean validTriangle;
        String triType;
        Scanner input;
        
        input = new Scanner(System.in);
        System.out.println("Let's have some fun with TRIANGLES!");
        System.out.println("To begin, enter the length of one side of the triangle: ");
        tside1 = input.nextDouble();
        System.out.println("Enter a second side of the triangle: ");
        tside2 = input.nextDouble();
        System.out.println("Enter the final side of the triangle: ");
        tside3 = input.nextDouble(); 
        
        // see if it is a valid triangle
        validTriangle = isValid(tside1,tside2, tside3);
       
        // if it is valid, display what type it is and the area of it
        if(validTriangle == true) {
            triType = triangleType(tside1, tside2, tside3);
            triArea = area(tside1, tside2, tside3);
            System.out.printf(" The triangle type is: " + triType +
                       "\n and the area is: " + triArea);
        } else {
            System.out.println("The triangle is not valid, so it doesn't have a triangle type, and I cannot determine area. ");
        }
        
        
    }
    
    public static boolean isValid(double sideA, double sideB, double sideC) 
    {
        boolean validity;
        double longestSide, shortsideA, shortsideB, temp, sumShorts;

        // compare sides to get the longest side of the three
        if(sideA > sideB) {
            temp = sideA;
            shortsideA = sideB;
        } else {
            temp = sideB;
            shortsideA = sideA;
        }
        
        if(temp > sideC) {
            longestSide = temp;
            shortsideB = sideC;
        } else {
            longestSide = sideC;
            shortsideB = temp;
        }
        
        // sum up the short sides
        sumShorts = shortsideA + shortsideB;
        
        // compare sum of short sides to the length of the longest side
        validity = sumShorts > longestSide;
   
        // return true if sum of two shorter sides is greater than the longest side
        
        return validity;
    }
    
    public static double area(double sideA, double sideB, double sideC) 
    {
        double s, area;
        // return area of the triangle can be computed using Heron's formula
        // s = (a + b + c) /2 (gives you the semi-perimeter. 
        s = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC));
        return area;
    }
    
    public static String triangleType(double a, double b, double c)
    {
        String triangleType;
        double big, med, small, temp;
        // return one of the folowing strings "Equilateral", "Isosceles", "Scalene", "Invalid Triangle".
        // determine type if a, b, and c represent the sides in ascending order 
        //(you must first determine if the triangle is valid. if it is valid then the triangle is:
        // "Equilateral" if a == c.
        // "Isosceles" if a == b or b == c
        // "Scalene" otherwise
        
        // compare sides to find out big, med, small 
         if(a > b) {
            small = b;
            temp = a;
        } else {
            small = a;
            temp = b;
        }
        if(temp > c) {
            big = temp;
            med = c;
        } else {
            big = c;
            med = temp;
        }

        // reset vars a, b, c, to be in ascending order according to above
        a = small;
        b =  med;
        c = big;
        
        // now compare to find type
        if (a == c) {
            triangleType = "Equilateral";
        } else if ((a == b) || (b == c)) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }
        
        return triangleType;
    }
    
}
