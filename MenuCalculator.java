import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char calculate;
    System.out.print("Do you want to calculate (Y or N): "); //ask for calculation
    calculate = sc.next().charAt(0); // read user input
    
    while  (calculate == 'Y'){  
      System.out.print("Enter an operation number (1: + ,2: - ,3: * ,4: /): "); // ask user to enter a number
      int operation = sc.nextInt(); // read user input
      
      System.out.print("Enter the first number: "); // ask user to enter a number
      int num1 = sc.nextInt(); // read user input
      System.out.print("Enter the second number: "); // ask user to enter a number
      int num2 = sc.nextInt(); // read user input
      switch (operation) {
        case 1:
          System.out.println(num1 + num2);
          break;
        case 2:
          System.out.println(num1 - num2);
          break;
        case 3:
          System.out.println(num1 * num2);
          break;
        case 4:
          System.out.println(num1 / num2);
          break;
        default:
          System.out.println("Invalid operation");
          break;
      }

    System.out.print("Do you want to calculate (Y or N): "); //ask for calculation
    calculate = sc.next().charAt(0); // read user input
    }
  }
}
