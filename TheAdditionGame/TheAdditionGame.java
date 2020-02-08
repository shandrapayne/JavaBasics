import java.util.Scanner;

public class TheAdditionGame
{

    public static void main(String[] args)
    {
        int problemsToAttempt, numOfCorrectAnswers, problemsGiven,
                rand1, rand2, solution, userAnswer;
        Scanner input = new Scanner(System.in);

        System.out.print(" Welcome to The Addition Game! "
                + "\n Enter the number of problems you would like to solve: ");
        problemsToAttempt = input.nextInt();
        System.out.println("Okay. Let's begin."); 
        numOfCorrectAnswers = 0;
        problemsGiven = 0;

        do
        {
            rand1 = 10 + (int) (Math.random() * 41);
            rand2 = 10 + (int) (Math.random() * 41);
        
            solution = rand1 + rand2;
            System.out.print(rand1 +  " + " + rand2 + " = ");
            userAnswer = input.nextInt();

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

        System.out.println("You answered " + numOfCorrectAnswers + " of " + problemsGiven + " problems correctly.");
        System.out.println("Thanks for playing!");
        System.exit(0);

        input.close();
    }

}