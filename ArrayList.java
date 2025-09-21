import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<>(); // create an ArrayList
    name.add("Ahaan"); //  enter first name
    arraylist(name); // call the arraylist method
    System.out.println(name);
  }
  public static void arraylist(ArrayList<String> name){
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the first name: "); // input first name
    String name1 = sc.nextLine(); 
    name.add(name1); // add name to ArrayList
    System.out.print("Enter the second name: "); // input second name
    String name2 = sc.nextLine(); 
    name.add(name2); // add name to ArrayList
    System.out.print("Enter the third name: "); // input third name
    String name3 = sc.nextLine();
    name.add(name3); // add name to ArrayList
    name.remove(2);  // remove the third name
  }
}
