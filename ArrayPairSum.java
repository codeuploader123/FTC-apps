import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    int[] numbers = {3,87,2,56,2,6}; // create an array of numbers
    int length = numbers.length; // find the length of the array
    int sum = 0; // create a sum variable
    int num1 =0; // create 1st number variable
    int num2 = 0; //create 2nd number variable
    for (int i = 0; i < length/2; i++){ // for loop to iterate through all pairs in the array
      num1 = numbers[i]; // get the 1st number in the pair
      num2 = numbers[length-1-i]; // get the 2nd number in the pair
      sum = num1 + num2; // add the 2 numbers together
      System.out.println(sum); // print the sum
    }
  }
}
