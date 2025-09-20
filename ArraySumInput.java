import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    int[] numbers = new int[10];
    int sum = 0; // create sum variable
    for (int i = 0; i < 10; i++){ // loop 10 times
      System.out.print("Enter a number: "); // prompt user to enter a number
      numbers[i] = sc.nextInt(); // read user input
      sum += numbers[i]; // add user input to sum
    }
    System.out.println(sum); // print sum
  }
}
