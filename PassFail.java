import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.print("Enter your Physics marks: "); // get input from user for their marks
    int pmarks = sc.nextInt(); // store input in variable pmarks
    System.out.print("Enter your Chemistry marks: "); // get input from user for their marks
    int cmarks = sc.nextInt(); // store input in variable pmarks
    System.out.print("Enter your Biology marks: "); // get input from user for their marks
    int bmarks = sc.nextInt(); // store input in variable bmarks
    int avgMarks = (pmarks + cmarks + bmarks) / 3;
    if (avgMarks >= 40) // check if the user passes
    {
      System.out.println("You passed!"); // print pass
    }
    else // else the user fails
    {
      System.out.println("You failed"); // print fail
    }
  }    
}


