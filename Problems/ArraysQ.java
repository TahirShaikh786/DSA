import java.util.Arrays;

public class ArraysQ {
  public static void main(String[] args) {
    int[] arr = {1, 3, 9, 23, 18};

    // Swap in Array
    // System.out.println(Arrays.toString(arr));
    // swap(arr, 0 , 4);
    // System.out.println(Arrays.toString(arr));

    // Find Max Number
    // System.out.println(ArrayMax(arr));
    // System.out.println(Maxrange(arr, 0, 2));

    // Revese an Array
    reverse(arr);
    System.out.println("Reversed Array: " + Arrays.toString(arr));
  }
  static void swap(int[] arr, int i1, int i2){
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }

  // Found on Whole array
  static int ArrayMax(int[] arr){
    int max = arr[0];
    for(int i = 1; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
  // Found on Array Specific range
  static int Maxrange(int[] arr, int start, int end){
    if(end > start){
      return -1;
    }

    if(arr == null){
      return -1;
    }

    int max = arr[start];
    for(int i = start; i <= end; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }

  // Reverse an array
  static void reverse(int[] arr){
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }

  }
}
