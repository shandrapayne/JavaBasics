public class Fraction
{
    
    private int numerator, denominator;

    
    // constructor
    public Fraction(int n, int d)
    {
         if (d < 0) 
        {
            n *= -1;
            d *= -1;
        }
       
        if (d == 0) 
        {
            d = 1;
        }
        
        numerator = n;
        denominator = d;
    }

    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }


  
    @Override
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public double getDecimal()
    {
        return (double)numerator / denominator;
    }

    public void reduce()
    {
        int div;
        
        div = gcd(numerator, denominator);
        
        numerator = numerator / div;
        
        denominator = denominator / div;
    }

    public String toMixed() 
    {
        int w, p;
        
        if (Math.abs(numerator) > denominator) 
        {
            w = numerator / denominator;
            p = numerator % denominator;
            
            if (w < 0) 
            {
                return w + " " + -p + "/" + denominator;
            }
            else if (p == 0) 
            {
                return Integer.toString(w);
            }
            else 
            {
                return w + " " + p + "/" + denominator;
            }
        }
        
        return this.numerator + "/" + denominator;
    }
    
    static int gcd(int a, int b) 
    {
        return b == 0 ? a : gcd(b, a % b);
    }
}
