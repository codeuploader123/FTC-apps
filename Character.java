import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter a word: ");
    String word = sc.nextLine(); // read user input
    for (int i = 0; i < word.length(); i++){ // check index for all letters
      System.out.println(word.charAt(i)); // print the character on a new line
    }
    }
}

