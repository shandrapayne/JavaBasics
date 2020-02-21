import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        String s, t;

        s = repeatIt("abc");

        t = repeatItNtimes("xy", 4);

    }

    public static String repeatIt(String phrase) {
        System.out.println(phrase);
        return phrase;
    }

    public static String repeatItNtimes(String phrase, int numOfTimes) {
        int x;
        x = 0;
        while (x <= numOfTimes) {
            x++;
            System.out.println(phrase);
        }
        return phrase;

    }

}
/*
 * mini-quiz from class. We were given the just the method names, and told to
 * create the methods.
 */