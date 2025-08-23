import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter the first leg of the triangle: "); // get input from user for first leg of triangle
    int a = sc.nextInt(); // store input in variable a
    System.out.println("Enter the second leg of the triangle: "); // get input from user for second leg of triangle
    int b = sc.nextInt(); // store input in variable b
    System.out.println("Enter the hypotenuse of the triangle: "); // get input from user for hypotenuse of triangle
    int c = sc.nextInt(); // store input in variable c
    String result = (a*a + b*b == c*c) ? "It is a pythogrean triplet" : "It is not a pythogrean triplet"; // check if it is a pythogrean triplet
    System.out.println(result); // print the result
  }    
}


