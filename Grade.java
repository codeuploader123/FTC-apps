import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.print("Enter your marks: "); // get input from user for their marks
    int marks = sc.nextInt(); // store input in variable marks
    if (marks >= 90) // check if marks are greater than or equal to 90
    {
      System.out.println("A"); // print grade
    }
    else if (marks >= 75)// if marks are between 75 and 89
    {
      System.out.println("B"); // print grade
    }
    else if (marks >= 50) // if marks are between 50 and 74
    {
      System.out.println("C"); // print grade
    }
    else // if marks are less than 50
    {
      System.out.println("D"); // print grade
    }
  }    
}


