import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    addNumbers();
  } 
  public static void addNumbers()
    {
      int calc = 0;
      for (int i = 1; i <= 10; i++){
        calc+=i;
      }
      System.out.println(calc);
    }
}


