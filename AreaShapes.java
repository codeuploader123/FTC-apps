import java.util.Scanner; // import library Scanner to get input from user
import java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Do you want to calculate the area of a circle, square or rectangle: ");
    String shape = sc.nextLine(); // read user input
    shape = shape.trim();
    if(shape.equalsIgnoreCase("circle")){
      circle();
    }
    else if(shape.equalsIgnoreCase("square")){
      square();
    }
    else if (shape.equalsIgnoreCase("rectangle")){
      rectangle();
    }
    else {
      System.out.println("Invalid input");
    }
  }
  public static void circle(){
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter the radius of the circle: ");
    double r = sc.nextDouble();
    double square = Math.pow(r, 2);
    double area = Math.PI * square;
    area = Math.round(area);
    System.out.println("Area of the circle roughly is: " + area);
  }
  public static void square(){
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter the side of the square: ");
    double s = sc.nextDouble();
    double area = Math.pow(s, 2);
    System.out.println("Area of the square is: " + area);
  }
  public static void rectangle(){
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter the length of the rectangle: ");
    double l = sc.nextDouble();
    System.out.print("Enter the width of the rectangle: ");
    double w = sc.nextDouble();
    double area = l * w;
    System.out.println("Area of the rectangle is: " + area);
  }
}
