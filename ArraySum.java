import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    int[] marks = {4,90,39,2,81,5};
    int sum = 0;
    for (int i = 0 ; i< marks.length; i++){
      sum += marks[i];
    }
    System.out.print(sum);
  }
}
