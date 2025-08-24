import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter the first side value: ");
    int s1 = sc.nextInt(); // get input from user
    System.out.println("Enter the second side value: ");
    int s2 = sc.nextInt(); // get input from user
    System.out.println("Enter the hypotenous value: ");
    int h = sc.nextInt(); // get input from user
    int category = 0;
    if (s1 +s1 <= h || s2 +h <= s1 || s1 + h <= s2 || s2>=h || s1>=h){
      category = 0;
    }
    else if (s1 * s1 + s2 * s2 == h * h){
      category = 1;
    }
    else {
      category = 2;
    }
    switch (category) {
      case 1: System.out.println("Right triangle");
        break;
      case 2: System.out.println("Not a right triangle");
        break;
      default:
        System.out.println("Invalid month");
        break;
    }
  }
}
