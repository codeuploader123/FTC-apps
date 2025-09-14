import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter your first name: "); // ask user to enter a number
    String firstname = sc.nextLine(); // read user input
    System.out.print("Enter your last name: "); // ask user to enter a number
    String lastname = sc.nextLine(); // read user input
    String name  = firstname + " " + lastname; // concat both strings
    String newname = name.replace('a', 'x'); // replace all 'a' with 'x'
    String newname1 = newname.replace('A', 'X'); // replace all 'A' with 'X'
    String finals = newname1.trim(); // remove all unnesecary spaces
    System.out.println(finals); // print the final string
    }
}
