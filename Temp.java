import java.util.Scanner; // import library Scanner to get input from user
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // define object sc in class Scanner
    System.out.print("Enter the temperature: "); // get input from user for the temperature
    int temp = sc.nextInt(); // store input in variable temp
    if (temp < 10) // check if temperature is less than 10
    {
      System.out.println("Wear a coat"); // print Wear a coat
    }
    else if (temp >= 10 && temp <= 20)// if temperature is between 10 and 20
    {
      System.out.println("Light Jacket recommended"); // print Light Jacket recommended
    }
    else if (temp > 20 && temp <= 30) // if temperature is between 20 and 30
    {
      System.out.println("T-shirt Weather"); // print T-shirt Weather
    }
    else // if temperature is greater than 30 
    {
      System.out.println("Stay indoors!"); // print Stay indoors!
    }
  }    
}


