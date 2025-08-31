import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: "); //ask for calculation
    int n = sc.nextInt(); // read user input
    int rev = 0;
    int x = 0;
    x = n;
    while (n>0){
      int rem = n%10;
      rev = rev*10+rem;
      n = n/10;
    }
    if (rev == x){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
      
  }   
}


