import java.util.Arrays;

public class Question_04_2D {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 4, 1 },
        { 18, -1, 3, 8 },
        { 78, 99, 0, 85 }
    };

    int[] ans = Search_IN_2D_ARRAY(arr, 99);
    System.out.println(Arrays.toString(ans));

    System.out.println(Search_IN_2D_ARR(arr, 1));

    System.out.println(Find_Minimum(arr));
    System.out.println(Find_Maximum(arr));
  }

  // Return Index
  static int[] Search_IN_2D_ARRAY(int[][] arr, int target) {
    if (arr.length == 0) {
      return new int[] { -1 };
    }

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (target == arr[row][col]) {
          return new int[] { row, col };
        }
      }
    }

    return new int[] { -1 };
  }

  // Return Boolean Value
  static boolean Search_IN_2D_ARR(int[][] arr, int target) {
    if (arr.length == 0) {
      return false;
    }

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (target == arr[row][col]) {
          return true;
        }
      }
    }

    return false;
  }

  // Finding Minimum Value
  static int Find_Minimum(int[][] arr) {
    if (arr.length == 0) {
      return -1;
    }

    int min = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (min > arr[row][col]) {
          min = arr[row][col];
        }
      }
    }
    return min;
  }

  // Finding Maximum Value
  static int Find_Maximum(int[][] arr) {
    if (arr.length == 0) {
      return -1;
    }

    int max = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (max < arr[row][col]) {
          max = arr[row][col];
        }
      }
    }
    return max;
  }
}
