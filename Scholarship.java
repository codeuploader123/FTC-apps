import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter your marks: "); // get input from user for marks
    int marks = sc.nextInt(); // store input in variable marks
    System.out.println("Enter your attendance: "); // get input from user for attendance
    int attendance = sc.nextInt(); // store input in variable attendance
    String scholarship = (marks >= 90) && (attendance >=80) ? "You are eligible for a scholarship" : "You are not eligible for a scholarship"; // check if the user is eligible for a scholarship
    System.out.println(scholarship); // print the result
  }    
}


