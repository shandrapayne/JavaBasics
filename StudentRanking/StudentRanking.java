import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentRanking {

  public static void main(String[] args) {
    File studentFile;
    double[] fileGPAs;
    int[] histGPA, rank;
    int amnt, i, place;
    String studentIDs;
    i = 0;
    studentFile = new File("studentdata.txt");
    amnt = getAmount(studentFile);
    studentIDs = new String[amnt];
    gpa = new double[amnt];
    rank = new int[amnt];
   
  
    try(Scanner sc = new Scanner(studentFile)) {

      while (sc.hasNext()) {

        studentIDs[i] = sc.next();
        fileGPAs[i] = sc.nextDouble();
        place = getPlace(fileGPAs, i);
        histGPA[place]++;
        i++;

      }
      sc.close();

    } catch (IOException exp) {
      exp.printStackTrace();
    }

    System.out.println("Student GPA's and Rank");
   
    // Histogram
        System.out.print("0.0 to 0.49     (" + histGPA[0] + ")");
        System.out.println(getStars(histGPA[0]));
        System.out.print("0.5 to 0.99     (" + histGPA[1] + ")");
        System.out.println(getStars(histGPA[1]));
        System.out.print("1.0 to 1.49     (" + histGPA[2] + ")");
        System.out.println(getStars(histGPA[2]));
        System.out.print("1.5 to 1.99     (" + histGPA[3] + ")");
        System.out.println(getStars(histGPA[3]));
        System.out.print("2.0 to 2.49     (" + histGPA[4] + ")");
        System.out.println(getStars(histGPA[4]));
        System.out.print("2.5 to 2.99     (" + histGPA[5] + ")");
        System.out.println(getStars(histGPA[5]));
        System.out.print("3.0 to 3.49     (" + histGPA[6] + ")");
        System.out.println(getStars(histGPA[6]));
        System.out.print("3.5 to 4.0      (" + histGPA[7] + ")");
        System.out.println(getStars(histGPA[7]));

        i = 0;
        
        while (i != amnt)
        {
            System.out.printf("%-9s%-4s  ", studentIDs[i], fileGPAs[i]);
            System.out.println(rank(fileGPAs), i, amnt));
            i++;
        }
  }

  public static int getAmount(File sf) {
    int amount;
    amount = 0;
    try (Scanner studentdata = new Scanner(sf)) {
      while (studentdata.hasNext()) 
      {
        studentdata.next();
        studentdata.nextDouble();
        amount++;
      }
    } catch (IOException exp) {
      exp.printStackTrace();
    }
    return amount;
  }

  public static int getPlace(double[] gpa, int i) {
    int place;
    place = -1;
    if (gpa[i] < 0.5) {
      place = 0;
    } else if (0.5 <= gpa[i] && gpa[i] < 1.0) {
      place = 1;
    } else if (1.0 <= gpa[i] && gpa[i] < 1.5) {
      place = 2;
    } else if (1.5 <= gpa[i] && gpa[i] < 2.0) {
      place = 3;
    } else if (2.0 <= gpa[i] && gpa[i] < 2.5) {
      place = 4;
    } else if (2.5 <= gpa[i] && gpa[i] < 3.0) {
      place = 5;
    } else if (3.0 <= gpa[i] && gpa[i] < 3.5) {
      place = 6;
    } else if (3.5 <= gpa[i] && gpa[i] <= 4.0) {
      place = 7;
    }
    return place;
  }

  public static String getStars(int gpa) {
    String star = "";
    int x;
    x = (int) Math.round(gpa * 0.1);
    while (x != 0) {
      star = star + "*";
      x--;
    }
    return star;
  }

  public static String rank(double[] gpa, int i, int amount) {
    int x, tie, rank;
    String rString;
    x = tie = 0;
    rank = 1;
    while (x != amount) {
      if (gpa[i] < gpa[x]) {
        rank++;
      }
      if ((gpa[i] == gpa[x]) && i != x) {
        tie++;
      }
      x++;
    }
    if (tie >= 1) {
      rString = "Tied " + rank + " with " + tie + " others";
    } else {
      rString = "" + rank;
    }
    return rString;

  }

}