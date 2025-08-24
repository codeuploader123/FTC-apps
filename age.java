  import java.util.Scanner; // import library Scanner to get input from user
  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // define object sc in class Scanner
      System.out.println("Enter your age: ");
      int age = sc.nextInt(); // get input from user
      int category = 2;
      if (age>=18){
        category = 0;
      }
      else if (age <18 && age >0){
        category = 1;
      }
      else {
        category = 2;
      }
      switch(category){
        case 0: System.out.println("Adult"); 
        break;
        case 1: System.out.println("Minor");
        break;
        default: System.out.println("Invalid age");
        break;
      }
    }    
  }
  
  
  
