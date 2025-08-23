import java.util.Scanner; // import library Scanner to recieve user input
  
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); //define a new scanner object called sc
    System.out.println("Are you a student: "); // Ask the user if they are a student
    boolean isStudent = sc.nextBoolean(); // Recieve user input
    System.out.println("Are you a member: "); // Ask the user if they are a member
    boolean isMember = sc.nextBoolean(); // Recieve user input
    System.out.println("Do you have a coupon: "); // Ask the user if they have a coupon
    boolean hasCoupon = sc.nextBoolean(); // Recieve user input
    String discount = isStudent == true || isMember == true || hasCoupon == true ? "You get a discount!" : "You don't get a discount!"; // If the user is a student, a member, or has a coupon, they get a discount. Otherwise, they don't.
    System.out.println(discount); // Print the discount message
  }

}  
