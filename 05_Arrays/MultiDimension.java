import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
  public static void main(String[] args) {
    /*
     * 2D Arrays are like matrix For Ex:-
     * [
     * 2 3 4
     * 5 6 7
     * ]
     * 1D Array :- []
     * Ex:-
     * int[] arr = new int[3]
     * int[] arr = { 1, 2, 3 };
     * 
     * 2D Array :- []:- No. of Rows []:- No. of Columns
     * int[][] arr = new int[3][3];
     * int[][] arr = {
     * {1, 2, 3},
     * {4, 5, 6,
     * {7, 8, 9}
     * };
     */
    Scanner in = new Scanner(System.in);

    // Dynamic Arrays
    int[][] arr2D = {
        { 1, 2, 3 }, // 0th Index
        { 4, 5 }, // 1st Index
        { 6, 7, 8, 9 } // 2nd Index -> arr2D[2][0] = {6, 7,}
    };

    // Input
    int[][] arr = new int[3][3];

    for (int row = 0; row < arr.length; row++) {
      // For each col in every row
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = in.nextInt();
      }
    }
    in.close();

    // 1st way for Output
    for (int row = 0; row < arr.length; row++) {
      // For each col in every row
      for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }

    // 2nd way for Output
    for (int row = 0; row < arr.length; row++) {
      // For each col in every row
      System.out.println(Arrays.toString(arr[row]));
    }

    // 3rd way to Display Enhanced For Loop
    for(int[] a : arr){
      System.out.println(Arrays.toString(a));
    }
  }
}
