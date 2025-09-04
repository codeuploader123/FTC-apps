import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    Main fibN = new Main(); // create an object of Main class
    fibN.printFibbonaci(number); // call printFibbonaci method from Main class
  } 
  public void printFibbonaci(int number) {
        int a = 0; // define first number in Fibbonaci sequence
        System.out.println(a);
        int b = 1; // define second number in Fibbonaci sequence
        System.out.println(b);
        for (int i = 1; i<=number-2; i++) { // loop until the number of Fibbonaci sequence is reached
            int c = a + b; // define next number in Fibbonaci sequence
            System.out.println(c);
            a = b;  // update a to be b
            b = c;  // update b to be c
        }
      }

}


