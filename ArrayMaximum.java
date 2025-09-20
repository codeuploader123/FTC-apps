import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {1,5,7,18,35,3}; // create array of numbers
    int num1 = numbers[2]; // store any number
    int num2 = numbers[4]; // store one more number
    int max = Math.max(num1,num2); // find the maximum
    System.out.println("The max number is: " + max); // print the maximum 
    
  }
}
