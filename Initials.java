import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter your name: "); // ask user to enter a number
    String name = sc.nextLine(); // read the number from user
    String caps = name.toUpperCase();
    char first = caps.charAt(0);
    int index = caps.indexOf(" ");
    int secondIndex = index+1;
    char second = caps.charAt(secondIndex);
    System.out.print(first);
    System.out.print(second);
  }
}

