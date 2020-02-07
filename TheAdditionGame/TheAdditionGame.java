import java.util.Scanner;

public class TheAdditionGame
{

    public static void main(String[] args)
    {
        int problemsToAttempt, numOfCorrectAnswers, problemsGiven,
                rand1, rand2, solution, userAnswer;
        Scanner input;

        input = new Scanner(System.in);

        // prompt user for how many problems they want
        System.out.print(" Welcome to The Addition Game! "
                + "\n Enter the number of problems you would like to solve: ");
        problemsToAttempt = input.nextInt();

        System.out.println("Okay. Let's begin.");
        
         // initalize 
        numOfCorrectAnswers = 0;
        problemsGiven = 0;

        do
        {
            // generate two rand integers between 10-50 (inclusive) using Math.random method
            rand1 = 10 + (int) (Math.random() * 41);
            rand2 = 10 + (int) (Math.random() * 41);
            
             // solution
            solution = rand1 + rand2;

            // display the problem
            System.out.print(rand1 +  " + " + rand2 + " = ");
            userAnswer = input.nextInt();

            // display if answer is correct or not
            if (userAnswer == solution)
            {
                System.out.println("That's right!");
                numOfCorrectAnswers++;
                problemsGiven++;
                System.out.println("( " + numOfCorrectAnswers + " of " + problemsGiven + " correct )");
            } else 
            {
                System.out.println("Incorrect. The answer is " + solution);
                problemsGiven++;
                System.out.println("( " + numOfCorrectAnswers + " of " + problemsGiven + " correct )");
            }

        } while (problemsGiven < problemsToAttempt);

        // completed all problems
        System.out.println("You answered " + numOfCorrectAnswers + " of " + problemsGiven + " problems correctly.");
        System.out.println("Thanks for playing!");
        System.exit(0);

        input.close();
    }

}