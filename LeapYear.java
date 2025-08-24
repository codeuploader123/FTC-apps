import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter the year: ");
    int year = sc.nextInt(); // get input from user
    if (year%4==0){
      System.out.println("Leap year");
    }
    else{
      System.out.println("Not leap year");
    }
  }
}
