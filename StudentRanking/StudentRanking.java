import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class StudenRanking {

  public static void main(String[] args) {
    // declare vars
    File studentFile;
    String content;
    Scanner sc;
    List temps;
    Double[] studentGPAarr;
    String[] studentNumArr;

   
    studentFile = new File("smallstudentdata.txt");
    sc = new Scanner(studentFile);


    try {

      while (studentFile.hasNextLine()) {
        // find next line
        String token = studentFile.nextLine();
        parseLine(token);
      }

    } catch (IOException exp) {
      exp.printStackTrace();
    }

    sc.close();

    // read file: get id number and gpa
    // transfer data into two separate arrays. (assume no more than 1000 students in
    // file)
    // may find it useful to creat additional arrays to complete the requirements.
    // You must create a simple diagram to show how many students fall into each of
    // 8 different categories. This type of diagram is known as a histogram and it
    // is generally useful to show how data is distributed across a range.

    // For each student in the input file, you must display their S-number, gpa, and
    // class rank. The S-number and gpa will already be in your arrays; however, you
    // must calculate their class rank.

  }

  // parse file

  public static void parseLine(String str) {
    String studentID;
    Double gpa;
    Scanner sc = new Scanner(str);

    // eventually separate the lines into two separate data arrays of studentID and gpa (these are separated by a space)
    // sc.useDelimiter(" ");

    // check if there is another line of input
    while(sc.hasNext()) {
      // eventually put these into separate arrays
      studentID = sc.next();
      gpa = sc.next();
      System.out.println("studentID: " + studentID);
      System.out.println("gpa: " + gpa);
    }

    sc.close();
  }

  // parse file to get StudentID's and put into StudentIDarray
  public static String getStudentIDs() {

  }

  // parse file to get gpas and put into gpaArray

  public static Double getStudentGpas() {

  }

  public static Double getGPADesignation() {
    // pass in gpa array and designate individual gpas
    /*
     * 0.0 <= gpa < 0.5 
     * 0.5 <= gpa < 1.0 
     * 1.0 <= gpa < 1.5 
     * 1.5 <= gpa < 2.0 
     * 2.5 <= gpa < 3.0 
     * 3.0 <= gpa < 3.5 
     * 3.5 <= gpa <= 4.0
     */

    // return GPA;

  }

  public static int retrieveStarCount() {
    // pass in gpa array and calculate the amount of stars that should be shown for each
    int starCount;

    /*
     * example: 
     * 0.0 to 0.49 (48) ***** 
     * 0.5 to 0.99 (82) ******** 
     * 1.0 to 1.49 (65) *******
     * 
     * The number in parentheses represents the total number of students that fall
     * within that category. Each * represents 10 students rounded to the nearest
     * 10.
     */

    // return starCount;
  }

  public static void formatRankingTable() {
    /*
     * Next you must display the student id number, the gpa, and the student’s class
     * rank. The class rank is a "competitive" ranking indicating the number of
     * students who have a better gpa. So, for example, if the student's rank is 27,
     * it means that there are 26 other students who have a gpa that is better than
     * the student with rank 27. Please output all the students in the order they
     * are in the input file such as: example:
     * 
     * S316542 3.45 27 
     * S29463 1.42 801 
     * S969870 2.75 T64 with 8 others
     * 
     * Notice that the rank for the last student indicates T64 which means that
     * there are 63 students with a gpa better than this student. It also indicates
     * that this student's gpa of 2.75 is the same as 8 other students (there are
     * are total of 9 students with a 2.75 gpa). In other words, this student is
     * tied for 64th place with 8 other students.
     */

  }

}