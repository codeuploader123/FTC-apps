import java.util.Scanner; // import library Scanner to recieve user input
  
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); //define a new scanner object called sc
    System.out.println("Enter your age: "); // ask for user age using sc
    int age = sc.nextInt(); // store the user input in variable age



    String eligibilty = age >= 18 ? "You can vote.": "You cannot vote."; // use ternary operator to check if user is eligible to vote
    
    System.out.println(eligibilty);//print if the the user is eligible to vote or not
  }

}

