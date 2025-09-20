import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {1,5,7,18,35,3}; // create array of numbers
    int length = numbers.length; // find the length of the array
    int i = 0; // create a counter variable
    while(i < length){ // create a while loop to iterate through the array
      int newnum = 0; // create a variable to store the new number
      newnum = 2*numbers[i]; // multiply the number by 2
      numbers[i] = newnum; // replace the old number with the new number 
      i++; // increment the counter variable
    }
    System.out.println(Arrays.toString(numbers));// print the array
  }
}
