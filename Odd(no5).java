import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: "); //ask for calculation
    int n = sc.nextInt(); // read user input
    for (int i = 1; i <= 2*n; i += 2){
      if (i %5 != 0){
        System.out.println(i);
      }
      else{
        continue;
      }
    }
    
      
  }   
}


