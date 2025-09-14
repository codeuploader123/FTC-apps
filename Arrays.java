import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    int[] marks = {98,79,82};
    marks[1] = 89;
    for (int i = 0; i < marks.length; i++){
      System.out.print(marks[i] + ", ");
    }
    
  }
}
