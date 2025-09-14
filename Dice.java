import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    double rand = Math.random();
    double dice = rand * 6 + 1;
    dice = Math.floor(dice);
    System.out.println (dice);
  }
}
