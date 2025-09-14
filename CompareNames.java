import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter first student name: ");
    String name1 = sc.nextLine(); // read user input
    System.out.print("Enter second student name: ");
    String name2 = sc.nextLine(); // read user input
    System.out.print("Enter third student name: ");
    String name3 = sc.nextLine(); // read user input
    int comp1 = name2.compareTo(name1); // compare name2 and name1
    int comp2 = name3.compareTo(name2); // compare name3 and name2
    int comp3 = name3.compareTo(name1);
    if (comp1 > 0 && comp2 >0){
      System.out.println(name1 + ", " + name2 + ", " + name3);
    }
    else if (comp1 >0 && comp2 <0){
      if (comp3 > 0){
        System.out.println(name1 + ", " + name3 + ", " + name2);
      }
      else {
        System.out.println(name3 + ", " + name1 + ", " + name2);
      }
    }
    else if (comp1 < 0 && comp2 < 0){
      System.out.println(name3 + ", " + name2 + ", " + name1);
    }
    else if (comp1 < 0 && comp2 >0){
      if (comp3 > 0){
        System.out.println(name2 + ", " + name1 + ", " + name3);
      }
      else{
        System.out.println(name2 + ", " + name3 + ", " + name1);
      }
    }
  }
}
