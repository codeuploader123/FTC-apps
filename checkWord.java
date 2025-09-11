import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter your sentence: "); // ask user to enter a number
    String sent = sc.nextLine(); // read the number from user
    System.out.println("Enter your word: ");
    String word = sc.nextLine();
    int index = sent.indexOf(word);
    if (index == -1){
      System.out.println("Not found");
    }
    else{
      System.out.println("Found");
    }
  }
}

