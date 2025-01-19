public class BinarySearch {
  public static void main(String[] args) {
    int[] nums = { -18, -12, -8, -5, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
    int ans = searchBinaryForAscending(nums, 0);
    System.out.println("The Target is at index " + ans);
  }

  
  /*
   * Return the index if Element Exists
   * Return -1 if it is not Exists
   */
  static int searchBinaryForAscending(int[] arr, int target) {
    if (arr.length == 0) {
      return Integer.MAX_VALUE;
    }

    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      // find the middle element
      // int mid = (start + end) / 2; // Might br possiblr that (start + end) exceed
      // the range of int in java

      // Better way to find mid
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
        // start = mid + 1; // For Descending
      } else if (target > arr[mid]) {
        start = mid + 1;
        // end = mid - 1; // For Descending
      } else {
        return mid;
      }
    }
    return -1;
  }

  static int searchBinaryForDescending(int[] arr, int target) {
    if (arr.length == 0) {
      return Integer.MAX_VALUE;
    }

    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      // find the middle element
      // int mid = (start + end) / 2; // Might br possiblr that (start + end) exceed
      // the range of int in java

      // Better way to find mid
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        start = mid + 1; 
        // end = mid - 1; // For Ascending
      } else if (target > arr[mid]) {
        end = mid - 1; 
        // start = mid + 1;  // For Ascending
      } else {
        return mid;
      }
    }
    return -1;
  }
}