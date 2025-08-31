import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: "); //ask for calculation
    int n = sc.nextInt(); // read user input
    int j = 1;
    int x = 2;
    int dummy = 0;
    for (int y = 1; y<=2; y++){
      System.out.println(j);
    }
    System.out.println(x);
    dummy = x;
    x+=j;
    System.out.println(x);
    for (int i =1; i<= n/3; i++){
      dummy+=x;
      System.out.println(dummy);
      x+=dummy;
      System.out.println(x);
    }
  }   
}


