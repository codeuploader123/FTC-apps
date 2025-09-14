import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter your first name: "); // ask user to enter a number
    String firstname = sc.nextLine(); // read user input
    System.out.print("Enter your last name: "); // ask user to enter a number
    String lastname = sc.nextLine(); // read user input
    String name  = firstname + " " + lastname;
    String newname = name.replace('a', 'x');
    String finals = newname.trim();
    System.out.println(finals);
    }
}

