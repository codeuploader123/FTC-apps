import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter the base of the triangle: ");
    double base = sc.nextDouble(); // get the base of the triangle
    System.out.print("Enter the height of the triangle: ");
    double height = sc.nextDouble(); // get the height of the triangle
    double hyposq = Math.pow(base,2)+ Math.pow(height,2);
    double hypo = Math.sqrt(hyposq);
    System.out.println(hypo);
  }
}
