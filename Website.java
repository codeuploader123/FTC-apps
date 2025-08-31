import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    printHeader();
    printBody();
    printFooter();
  } 
  public static void printHeader()
    {
      System.out.println("------------------------Welcome to the Java Website--------------------\n");
    }
  public static void printBody(){
    System.out.println("This website has been created using Java and methods. Methods are a great way to organize your code and store your information effectively. If you want to  call a code multiple times, you can use a method to store that code and call it whenever you need it.\n");
  }
  public static void printFooter(){
    System.out.println("-------------------------------------------------------------");
    System.out.println("\t\t\t\t\tThank you for visiting the website!");
    System.out.println("\t\t\t\t\tAhaan_Java©. All rights reserved.");
  }
}


