import java.util.*;

public class Main {
  public static void main(String[] args) {
    String[] names = {"A", "B", "C"};
    ArrayList<String> name = new ArrayList<>(); // create an ArrayList 
    String dummy = "";
    for(int i = 0; i < names.length; i++){ // loop through the array
      dummy = names[i]; // get the name
      name.add(dummy); // add the name to the ArrayList
    }
    System.out.println(name); // print the ArrayList
  }
}
