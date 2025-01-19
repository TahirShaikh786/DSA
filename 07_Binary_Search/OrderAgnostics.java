public class OrderAgnostics {
  public static void main(String[] args) {
    int[] nums = {1, 2, 34, 40, 60, 75, 105, 200};
    int ans = orderAgnostics(nums, 34);
    System.out.println("The target Element is at index " + ans);
  }

  // Order Agnostics means when we Don't Known the array is Sorted in Ascwnding or not
  static int orderAgnostics(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // Find Wheather the array is sorted in ascending or Descending order
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (target > arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}