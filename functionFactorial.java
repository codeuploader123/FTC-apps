import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int ans =factorial(number);
    System.out.println(ans);
  } 
  public static int factorial(int n) {
      int fact=1;
      if (n<0){
        System.out.println("Invalid input");
        return 0;
      }
      else if(n==0){
        return 0;
      }
      else{
        while(n>0){
          fact=fact*n;
          n--;
        }
        return fact;
      }
    }
}


