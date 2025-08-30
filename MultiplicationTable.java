import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.print("Enter a number: "); // get number from user
    int n = sc.nextInt(); // get input from user
    for (int i =1 ; i<=10; i++ ) { // keep on looping until i = 10
      System.out.printf("%d * %d = %d \n", n, i, n*i); //multiply n with i and print the result
    }
  }
}
