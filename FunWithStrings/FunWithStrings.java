

public class FunWithStrings
{

  
    public static void main(String[] args)
    {
        String s1, s2, s3, s4, s5, s6, s7, s8;
        boolean isEqual, b;
        int x, y, z;
        char ch;
     
        System.out.println("Playing around with strings because I like it.");
        
        // Let s1 be " Welcome " and s2 be " welcome ". 
        s1 = " Welcome ";
        s2 = " welcome ";
        
        System.out.println("For reference s1 = \" Welcome \" and s2 = \" welcome \" ");
        
       // (a) Check whether s1 is equal to s2 and assign the result to a Boolean variable isEqual.
            isEqual = s1.equals(2);
            System.out.println("Comparing s1 and s2 with the \"equals\" method results in:  " + isEqual);
        
       // (b) Check whether s1 is equal to s2, ignoring case, and assign the result to a Boolean variable isEqual.
            isEqual = s1.equalsIgnoreCase(s2);
            System.out.println("Comparing s1 and s2 with the \"equalsIgnoreCase\" method results in: " + isEqual);
        
       // (c) Compare s1 with s2 and assign the result to an int variable x.
            x = s1.compareTo(s2);
            System.out.println("Comparing s1 and s2 with the \"compareTo\" method results in: " + x);
            
       // (d) Compare s1 with s2, ignoring case, and assign the result to an int variable x.
            x = s1.compareToIgnoreCase(s2);
            System.out.println("Comparing s1 and s2 with the \"compareToIgnoreCase\" method results in: " + x);
            
       // (e) Check whether s1 has the prefix AAA and assign the result to a Boolean variable b.
            b = s1.startsWith("AAA");
            System.out.println("The result of checking whether s1 starts with \"AAA\" is: " + b);
            
       // (f) Check whether s1 has the suffix AAA and assign the result to a Boolean variable b.
            b = s1.endsWith("AAA");
            System.out.println("The result of checking whether s1 ends with \"AAA\" is: " + b);
            
       // (g) Assign the length of s1 to an int variable x.
            x = s1.length();
            System.out.println("The length of s1 is: " + x);
            
       // (h) Assign the first character of s1 to a char variable s.
            ch = s1.charAt(0);
            System.out.println("The first character of s1 is: " + ch);
            
        // (i) Create a new string s3 that combines s1 with s2.
            s3 = s1.concat(s2);
            System.out.println("Combining s1 & s2 results in the string: " + s3);
            
        // (j) Create a substring of s1 starting from index 1.
            s4 = s1.substring(1);
            System.out.println("Creating a substring of s1 starting at index 1 results in: " + s4);

        // (k) Create a substring of s1 from index 1 to index 4.
            s5 = s1.substring(1, 4);
            System.out.println("Creating a substring of s1 from index 1 to index 4 results in: " + s5);
            
        // (l) Create a new string s6 that converts s1 to lowercase.
            s6 = s1.toLowerCase();
            System.out.println("Converting s1 to lowercase using the \"toLowerCase()\" method results in: " + s6);
            
        // (m) Create a new string s7 that converts s1 to uppercase.
            s7 = s1.toUpperCase();
            System.out.println("COnverting s1 to uppercase using the \"toUpperCase()\" method results in: " + s7);
            
        // (n) Create a new string s8 that trims whitespaces on both ends of s1.
            s8 = s1.trim();
            System.out.println("Trimming whitespace from s1 using the \"trim\" method results in: " + s8);
            
        // (o) Assign the index of the first occurrence of the character e in s1 to an int variable y.
            y = s1.indexOf('e');
            System.out.println("First occurrence of the character \"e\" in s1 results in: " + y);
            
        // (p) Assign the index of the last occurrence of the string abc in s1 to an int variable z.
            z = s1.lastIndexOf("abc");
            System.out.println("Index of the last occurrence of the string \"abc\" in s1 results in: " +z);
            
      
        System.out.println("Alright, that's enough of this.");

    }
    
}
