
import java.util.Scanner;

public class TheLetterGradeCalculator
{

  
    public static void main(String[] args)
    {
        int idNumber, q1, q2, e1, e2, bestQuiz, bestExam;
        double rawPercentage, actualPercentage;
        String studentName, formattedPercentage;
        char letterGrade;
        Scanner input;
        
        input = new Scanner(System.in);
        
        // enter student's info
        System.out.println("Please enter the student's name: ");
        studentName = input.next();
        System.out.println("Enter the student's ID number: ");
        idNumber = input.nextInt();
        System.out.println("Enter the first quiz score: (ie: 95) ");
        q1 = input.nextInt();
        System.out.println("Enter the second quiz score: ");
        q2 = input.nextInt();
        bestQuiz = max(q1, q2);
        
        System.out.println("Enter the first exam score: ");
        e1 = input.nextInt();
        System.out.println("Enter the second exam score: ");
        e2 = input.nextInt();
        bestExam = max(e1, e2);
        
        rawPercentage = computeRawPercentage(bestQuiz, bestExam);
        actualPercentage = rawPercentage / 100;
        formattedPercentage = String.format("%.2f", actualPercentage);
       
        letterGrade = getLetterGrade(actualPercentage);
        
        System.out.print(" The final grade for the student:  " + studentName +
                "\n student Id #: " + idNumber +
                "\n is: " + letterGrade + " ( " + formattedPercentage + " % ) ");
        
    }
    
    
    public static int max(int n1, int n2) 
    {
        int higherScore;
        // two numbers will be sent here to be compared for which score is the highest of the two
        if(n1 > n2) {
            higherScore = n1;
        } else {
            higherScore = n2;
        }
         return higherScore;
    }
    
    public static double computeRawPercentage(int bestQuiz, int bestExam)
    {
        // compute raw percentage of final grade by determining 40% of the quiz score
        // and 60 % of the exam score
        return ((bestQuiz*.4)+(bestExam*.6)) * 100;
    }
    
    public static char getLetterGrade(double percentage) 
    {
        char grade;
        // return student's letter grade (ie A, B, C, D, F)
        if(percentage >= 90.0)
            grade = 'A';
        else if (percentage >= 80.0)
            grade = 'B';
        else if (percentage >= 70.0)
            grade = 'C';
        else if(percentage >= 60.0)
            grade = 'D';
        else
            grade = 'F';
       
        return grade;
    }
    
    
}