import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a new Scanner object
    System.out.print("Enter a number: "); // ask user to enter a number
    int n = sc.nextInt();
    int k = 1; // initialize k to 1
    for (int i = 1; i <= n; i++) { // keep on looping until i is less than or equal to n
      k *= i; // multiply k with i
    }
    System.out.println(k); // print the result
  }
}
