import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter a number: "); // get input from user for a number
    int n = sc.nextInt(); // store input in variable n
    if (n % 2 == 0) // if n is even
    {
      System.out.println("The number is even."); // print that the number is even
    } 
    else // else if n is odd
    {
      System.out.println("The number is odd."); // print that the number is odd
    }
  }    
}


