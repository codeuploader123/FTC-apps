import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int password = 1234;
    System.out.print("Enter your password: "); //ask for calculation
    int user = sc.nextInt(); // read user input
    int i = 0;
    while (true){
      i++;
      if (user == password){
        System.out.println("Correct password");
        break;}
      else{
        System.out.println("Incorrect password");
        if (i == 3){
          System.out.println("You have tried too many times");
          break;
        }
        else{
          System.out.print("Enter your password: ");
          user = sc.nextInt(); // read user input
        }
      }
    }
      
  }   
}


