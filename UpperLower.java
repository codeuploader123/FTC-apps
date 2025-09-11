import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter your word: "); // ask user to enter a number
    String word = sc.nextLine(); // read the number from user
    int length = word.length();
    int firstHalf  = length / 2;
    String first =  word.substring(0, firstHalf);
    String second = word.substring(firstHalf, length);
    String upper = first.toUpperCase();
    String lower = second.toLowerCase();
    System.out.print(upper);
    System.out.println(lower);
    
  }
}

