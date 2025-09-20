import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    String[] words = {"Hi","No","FTC","Java","Programming"}; // create array of words
    int length = words.length; // find length of array words
    String merge = words[0] + " " + words[length-1]; // merge first and last word
    System.out.println(merge); // print the merged words
  }
}
