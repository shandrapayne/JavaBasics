import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
      int a, b, x;
      a = 3;
      b = 4;
      x = 1;

       if(a<b)
       {
           while(a <= 30) 
           {
               a = a * 10;
               x = x + 5;
           }
           System.out.println(x + "");
           System.out.println(a);
       }
       else {
           System.out.println("i better find a new career");
       }
       }

    

}
