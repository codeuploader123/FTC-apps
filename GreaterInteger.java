public class Main {
  public static void main(String[] args) {
    // define integers a, b, and c
    int a = 3; 
    int b = 2;
    int c = 5;
    String check = a>b ? (a>c ? "a is greater" : "c is greater") : (b>c ? "b is greater" : "c is greater"); // if a>b then check if a>c else check if b>c
    System.out.println(check); // print the result
  }
}


