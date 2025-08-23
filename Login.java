import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    String username = "Java";
    String password = "password";
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.print("Enter the username: "); // get input from user for a username
    String usernameInput = sc.nextLine(); // store input in variable usernameInput
    System.out.print("Enter the password: "); // get input from user for a password
    String passwordInput = sc.nextLine(); // store input in variable passwordInput
    if (usernameInput.equals(username) && passwordInput.equals(password)) // check if username and password are correct
    {
      System.out.println("Login successful"); // print Login successful
    }
    else // if username and password are not correct
    {
      System.out.println("Incorrect credentials"); // print Incorrect credentials
    }
  }    
}


