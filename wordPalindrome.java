import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter your word: "); // ask user to enter a number
    String word = sc.nextLine(); // read user input
    int length = word.length(); // find word length
    int counter = 0; // create counter variable
    for (int i = 0; i <= length/2; i++){ // for all indexes in the first half of the word
      if (word.charAt(i) == word.charAt(length - i - 1)){ // if the character is same as its corresponding character
        counter ++; // increase the counter
      }
    }
    if (counter == length/2){ // if counter is increased for all letter pairs
      System.out.println("It is a palindrome"); // print palindrome
    }
    else{ 
      System.out.println("It is not a palindrome"); // not a palindrome
    }
    }
}
