import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean check = false;
    System.out.print("Enter the no. of rows of matrix 1: "); // no. of rows of matrix 1
    int rows1 = sc.nextInt();
    System.out.print("Enter the no. of columns of matrix 2: "); // no. of columns of matrix 2
    int columns2 = sc.nextInt();
    System.out.print("Enter the no. of columns of matrix 1 / no. of rows of matrix 2: "); // no. of columns of matrix 1 / no. of rows of matrix 2
    int columns1rows2 = sc.nextInt();
    int[][] num1 = new int[rows1][columns1rows2]; // matrix 1
    int[][] num2 = new int[columns1rows2][columns2]; // matrix 2
    int[][] result = new int[rows1][columns2]; // final matrix
    System.out.println("Matrix 1:");
    for (int i = 0; i < rows1; i++) { // finding all elements of matrix 1
        for (int j = 0; j < columns1rows2; j++) {
            System.out.print("Enter element at [" + i + "][" + j + "]: ");
            num1[i][j] = sc.nextInt(); // taking input from user for elements of matrix 1
        }
    }
    System.out.println("Matrix 2:");
    for (int i = 0; i < columns1rows2; i++) { // finding all elements of matrix 2
        for (int j = 0; j < columns2; j++) {
            System.out.print("Enter element at [" + i + "][" + j + "]: ");
            num2[i][j] = sc.nextInt(); // taking input from user for elements of matrix 2
        }
    }
    for (int i = 0; i < rows1; i++){ // multiplying matrix 1 and matrix 2
      for (int j = 0; j < columns2; j++){
        for (int k = 0; k < columns1rows2; k++){
          result[i][j] = result[i][j] + num1[i][k] * num2[k][j]; // multiplying and adding the elements
        }
      }
    }
    System.out.println(Arrays.deepToString(result)); // printing the final matrix
  }
}
