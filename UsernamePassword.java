import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    String username = "Student123"; // store the username and password
    String password = "Password@123";
    System.out.print("Enter your username: "); // ask user to enter a username
    String word = sc.nextLine(); // read user input
    boolean upper = false; // store boolean values for each criteria
    boolean lower = false;
    boolean special = false;
    if (word.equalsIgnoreCase(username)){
      System.out.println("Correct username"); // print if username is correct
      System.out.print("Enter your password: "); // ask user to enter password
      String pass = sc.nextLine(); // read user input
      for (int i = 0; i< pass.length(); i++){  // for all characters in the password
        char ch = pass.charAt(i); // get the character at index i
        if (Character.isUpperCase(ch)){ // if the character is uppercase 
          upper = true; // update the boolean value
        }
        if (Character.isLowerCase(ch)){ // if the character is lowercase
          lower = true; // update the boolean value
        }
        if (ch == '!' || ch == '@' || ch == '$' || ch == '%' || ch == '&'){ // if the character is a special character
          special = true; // update the boolean value
        }
      }
      if (upper && lower && special){ // if all criteria are met
        System.out.println("Password follows criteria."); // print the result
      }
      else{
        System.out.println("Password does not follow criteria."); // print the result
      }
      if (pass.equals(password)){ // if the password is correct
        System.out.println("Correct password"); // print the result
      }
      else{ // if the password is incorrect
        System.out.println("Incorrect password"); // print the result
      }
    }
    else { // if the username is incorrect
      System.out.println("Incorrect username"); // print the result
    } 
      

  }
}
