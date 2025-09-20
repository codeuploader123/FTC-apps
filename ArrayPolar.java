import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {1,5,7,18,35,3}; // create array of numbers
    int length = numbers.length; // get length of array
    int l = 0; // save largest number variable
    int s  = 100; // save smallest number variable
    for (int i = 0; i < length; i++){ // create for loop to go through each number in array
      if (numbers[i] > l){ // if the number is larger than the current largest number
        l = numbers[i]; // update the largest number
      }
      if (numbers[i] < s){ // if the number is smaller than the current smallest number
        s = numbers[i]; // update the smallest number
      }
    }
    System.out.println("The largest number is " + l); // print the largest number
    System.out.println("The smallest number is " + s); // print the smallest number
  }
}
