import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Main fin = new Main(); // create an object of Main class
    fin.Menu(); // call Menu method
  }

  public void checkPrime(int a){ // method to check if a number is prime
    boolean prime = true;
    for (int i = 2; i<a; i++){ // loop from 2 to a-1
      if (a % i == 0){ 
        prime = false; // if a is divisible by i, then it is not prime
        break;
      }
    }
    if (prime){
      System.out.println(a + " is a prime number"); // print the result
    }
    else{
      System.out.println(a + " is not a prime number"); // print the result
    }
  }
  public void Menu(){
    Scanner sc = new Scanner(System.in); // create an object of Scanner class
    System.out.print("Do you want to check for prime(1), find multiplication table(2) or exit (3): "); // print the menu
    int choice = sc.nextInt();
    if (choice == 1){
      System.out.print("Enter a number: "); // get input from user
      int n = sc.nextInt();
      checkPrime(n); // call checkPrime method
    }
    else if (choice == 2){
      System.out.print("Enter a number: "); // get input from user
      int n = sc.nextInt();
      multiply.printTable(n); // call printTable method from multiply class
    }
    else if (choice == 3){
      System.out.println("Exiting..."); // exit the program
    }
    else {
      System.out.println("Invalid choice"); // print invalid choice
    }
  }
}

