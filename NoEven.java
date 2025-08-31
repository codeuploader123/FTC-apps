import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 10; i ++){
      if (i %2 != 0){
        System.out.println(i);
      }
      else{
        continue;
      }
    }
    
      
  }   
}


