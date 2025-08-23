import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter a number: "); // get input from user for a number
    int n = sc.nextInt(); // store input in variable n
    if (n > 0) // if n is positive
    {
      System.out.println("The number is positive."); // print that the number is positive
    } 
    else  if (n == 0)// else if n is zero
    {
      System.out.println("The number is zero."); // print that the number is odd
    }
    else // else the number is negative
    {
      System.out.println("The number is negative.");
    }
  }    
}


