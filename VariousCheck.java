import java.util.Scanner; // import library Scanner to get input from user

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a Scanner object
    System.out.print("Enter your sentence: "); // ask user to enter a number
    String sent = sc.nextLine();
    String general = sent.toLowerCase(); // convert the sentence to lowercase for general use
    int index = sent.lastIndexOf("e"); // find the last index of 'e' in the sentence
    System.out.println("The last index of 'e' is: " + index); // print the last index of 'e'
    int index1 = general.indexOf("the"); // find the index of 'The' in the sentence
    if (index1 == 0){// check if the sentence starts with 'The'
      System.out.println("The sentence starts with 'The'"); // print the result
    }
    else if (index1 == -1){ // check if the sentence contains 'The'
      System.out.println("The sentence does not contain 'The'"); // print the result
    }
    else{ // if the sentence contains 'The' but does not start with 'The'
      System.out.println("The sentence does not start with 'The'"); // print the result
    }
    int index2 = general.indexOf("end"); // find the index of 'end' in the sentence
    if (index2 == sent.length() - 3){ // check if the sentence ends with 'end'
      System.out.println("The sentence ends with 'end'"); // print the result
    }
    else if (index2 == -1){ // check if the sentence contains 'end'
      System.out.println("The sentence does not contain 'end'"); // print the result
    }
    else{ // if the sentence contains 'end' but does not end with 'end'
      System.out.println("The sentence does not end with 'end'"); // print the result
    }
  }
}

