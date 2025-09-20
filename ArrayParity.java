import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    int[] numbers = new int[10]; // create an array of 10 integers
    int even = 0;
    int odd = 0;
    for(int i = 0; i < 10; i++){ // loop from 0 to 9
      System.out.print("Enter a number: "); // ask user to enter a number
      numbers[i] = sc.nextInt(); // get input from user and store it in the array
      if (numbers[i] % 2 == 0){ // if the number is even
        even++; // increment even
      }
      else{ // if the number is odd
        odd++; // increment odd
      }
    }
    System.out.println(even); // print the number of even numbers
    System.out.println(odd); // print the number of odd numbers
  }
}
