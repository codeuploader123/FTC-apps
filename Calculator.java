  import java.util.Scanner; // import library Scanner to get input from user
  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // define object sc in class Scanner
      System.out.println("Enter the first number: ");
      int num1 = sc.nextInt(); // get input from user
      System.out.println("Enter the second number: ");
      int num2 = sc.nextInt(); // get input from user
      char operator = sc.next().charAt(0); // get input from user
      switch(operator) {
        case '+': System.out.println(num1 + num2); 
        break;
        case '-': System.out.println(num1 - num2);
        break;
        case '*': System.out.println(num1 * num2);
        break;
        case '/': System.out.println(num1 / num2);
        break;
        default: System.out.println("Invalid operator");
        break;
      }
    }    
  }
  
  
  
