import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.println("Enter the cost price: "); // get input from user for cost price
    int cp = sc.nextInt(); // store input in variable cp
    System.out.println("Enter the selling price: "); // get input from user for selling price
    int sp = sc.nextInt(); // store input in variable sp
    int pl = sp - cp; // calculate profit/loss
    String confirm = pl >= 0 ? pl > 0 ? "Profit of ": "No profit, no loss " : "Loss of " ; // check if there is profit or loss
    System.out.println(confirm + "₹" + pl); // print the result
    double percentage = (double) pl / cp * 100; // calculate percentage of profit/loss
    System.out.println("Percentage " + confirm + percentage + "%"); // print the result
  }    
}


