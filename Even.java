import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter a number: "); // get number from user
    int n = sc.nextInt(); // get input from user
    for (int i =2 ; i<=n*2; i += 2) { // keep on defining n even numbers as i
      System.out.println(i); // print out i
    }
  }
}
