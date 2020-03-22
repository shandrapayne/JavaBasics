import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class StudentRanking 
{

  public static void main(String[] args) {
    // declare vars
    File studentFile;
    ArrayList<String> fileStudentIDs = new ArrayList<String>();
    ArrayList<Double> fileGPAs = new ArrayList<Double>();
    ArrayList<Integer> gpaGroupOcc = new ArrayList<Integer>();
    ArrayList<String> stars = new ArrayList<String>();
    String[][][] starTable;

    studentFile = new File("smallstudentdata.txt");
  
    try(Scanner sc = new Scanner(studentFile)) {

      while (sc.hasNext()) {

        fileStudentIDs.add(sc.next());
        fileGPAs.add(sc.nextDouble());

      }
      sc.close();

    } catch (IOException exp) {
      exp.printStackTrace();
    }

    gpaGroupOcc = gpaRangeOccurrences(fileGPAs);
    stars = retrieveStarCount(gpaGroupOcc);
    starTable = displayStarTable(stars, gpaGroupOcc);

    System.out.println(starTable);
    
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


  public static ArrayList<Integer> gpaRangeOccurrences(ArrayList<Double> gpas) {
    ArrayList<Integer> rangeOccurrences = new ArrayList<Integer>();
    rangeOccurrences.add(0);
    rangeOccurrences.add(0);
    rangeOccurrences.add(0);
    rangeOccurrences.add(0);
    rangeOccurrences.add(0);
    rangeOccurrences.add(0);
    rangeOccurrences.add(0);
    rangeOccurrences.add(0);
 
    int a, b, c, d, e, f, g, h;
    a = b = c = d = e = f = g = h = 0; 


    for(Double gpa : gpas) {
      
      if (gpa >= 3.5) { // 3.5 <= gpa <= 4.0
        a += 1;
        rangeOccurrences.set(0, a);
      } else if (gpa >= 3.0) { // 3.0 <= gpa < 3.5 
        b += 1;
        rangeOccurrences.set(1, b);
      } else if (gpa >= 2.5) { //  2.5 <= gpa < 3.0 
        c += 1;
        rangeOccurrences.set(2, c);
      } else if (gpa >= 2.0){ //    2.0 <= gpa < 2.5
        d += 1;
        rangeOccurrences.set(3, d);
      } else if (gpa >= 1.5) { // 1.5 <= gpa < 2.0 
        e += 1;
        rangeOccurrences.set(4, e);
      } else if (gpa >= 1.0) { //  1.0 <= gpa < 1.5 
        f += 1;
        rangeOccurrences.set(5, f);
      } else if (gpa >= 0.5) { // 0.5 <= gpa < 1.0 
        g += 1;
        rangeOccurrences.set(6, g);
      } else if (gpa >= 0.0) { //  0.0 <= gpa < 0.5 
        h += 1;
        rangeOccurrences.set(7, h);
      }
    }
  
    return rangeOccurrences;
  }



  public static ArrayList<String> retrieveStarCount(ArrayList<Integer> occFreq) {
    String starStr, finalStarStr;
    int starCount;
    ArrayList<String> stars = new ArrayList<String>();
   
    starStr = "*";
    starCount = 0;

    for(Integer occ : occFreq) {
      // TO DO: create star table
      int num;
      num = occ;
      num = Math.round(num/10) * 10;
      starCount = num/10;
      finalStarStr = starStr.repeat(starCount);
      stars.add(finalStarStr);
    
     }
     

     return stars;
    

    /*
      example: 
      0.0 to 0.49 (48) ***** 
      0.5 to 0.99 (82) ******** 
      1.0 to 1.49 (65) *******
      
      The number in parentheses represents the total number of students that fall
      within that category. Each * represents 10 students rounded to the nearest
      10.
     */

  }

  public static String[][][] displayStarTable(ArrayList<String> stars, ArrayList<Integer> occs) {
    String[] gpaOcc = occs.toArray(new String[occs.size()]);
    String[] starArr = stars.toArray(new String[stars.size()]);
    String[] gpaGroups = { "4.0 - 3.5", "3.0 - 3.49", "2.5 - 2.99", "2.0 - 2.49", "1.5 - 1.99", "1.0 - 1.5", "0.5 - 0.99", "0.0 - 0.49"};
    String[][][] starMatrix = { gpaGroups, gpaOcc, starArr };
    System.out.println(starMatrix);
   // String starTable;
  //  starTable = "GPA Range   -   Students -   ";
   
    for(int i=0; i < starMatrix.length; i++){
      for(int j=0; j < starMatrix[0].length; j++) {
        for(int k=0; k < starMatrix[0][0].length; k++) {
           starMatrix = starMatrix[i][j][k];
        }
      }
    }

   return starMatrix;
  }

 // public static double rankStudents() {
   

 // }

  //public static void formatRankingTable() {
    /*
     Next you must display the student id number, the gpa, and the student’s class
     rank. The class rank is a "competitive" ranking indicating the number of
     students who have a better gpa. So, for example, if the student's rank is 27,
     it means that there are 26 other students who have a gpa that is better than
     the student with rank 27. Please output all the students in the order they
     are in the input file such as: example:
     
     S316542 3.45 27 
     S29463 1.42 801 
     S969870 2.75 T64 with 8 others
      
      Notice that the rank for the last student indicates T64 which means that
      there are 63 students with a gpa better than this student. It also indicates
      that this student's gpa of 2.75 is the same as 8 other students (there are
      are total of 9 students with a 2.75 gpa). In other words, this student is
      tied for 64th place with 8 other students.
     */

 // }

}