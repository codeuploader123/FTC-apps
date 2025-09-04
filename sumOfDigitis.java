import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    Main s = new Main(); // call Main class
    s.sumOfDigits(n); // call sumOfDigits method
  } 
  public void sumOfDigits(int n){
    int sum =0;
      while (n>0){
        sum += n%10; // take last digit and add to sum
        n /= 10; // remove last digit
      }
    System.out.println("Sum of digits are: " + sum);
  }
}
