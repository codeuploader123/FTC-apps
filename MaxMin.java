import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt(); // get the first number from user
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt(); // get the second number from user
    System.out.print("Enter the third number: ");
    int num3 = sc.nextInt(); // get the third number from user
    int max = Math.max(num1, Math.max(num2, num3)); // find the maximum number
    int min = Math.min(num1, Math.min(num2, num3)); // find the minimum number
    System.out.println("The maximum number is: " + max); // print the maximum number
    System.out.println("The minimum number is: " + min); // print the minimum number
  }
}
