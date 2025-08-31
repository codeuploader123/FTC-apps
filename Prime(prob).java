import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean prime = false;
    System.out.print("Enter your number: "); //ask for calculation
    int n = sc.nextInt(); // read user input
    while  (true){
      if (n>1)
      {
        for(int i = 2; i*i <= n; i++){
          if (n % i == 0){
            prime = false;
          }
          break;
      }
      }
      else{
          prime = true;
          System.out.printf("%d is a prime", n);
          break;
        }
      System.out.println("Your number is not prime. Try again");
      System.out.print("Enter your number: "); //ask for calculation
      n = sc.nextInt(); // read user input

        
      }
    }
      
  }
