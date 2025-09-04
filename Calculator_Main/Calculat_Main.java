import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an operation: ");
    char op = sc.next().charAt(0);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    double ans;
    if (op == '+'){
      ans = mathHelper.add(num1, num2);      
    }
    else if(op == '-'){
      ans = mathHelper.subtract(num1, num2);
    }
    else if (op == '*'){
      ans = mathHelper.multiply(num1, num2);
    }
    else if (op == '/'){
      ans = mathHelper.divide(num1, num2);
    }
    else{
      System.out.println("Invalid operation");
      return;
    }
    System.out.println("The answer is: " + ans);
  } 
}
