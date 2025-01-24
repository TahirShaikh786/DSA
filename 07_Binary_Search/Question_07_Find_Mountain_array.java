// https://leetcode.com/problems/find-in-mountain-array/

public class Question_07_Find_Mountain_array {
  public static void main(String[] args) {
    int[] nums = { 0, 5, 3, 1 };
    int target = 1;
    System.out.println(findInMountainArray(target, nums));
  }

  static int findInMountainArray(int target, int[] arr) {
    int peak = peakIndex(arr);
    int firstTry = orderDiagnostics(arr, target, 0, peak);
    if (firstTry != -1) {
      return firstTry;
    } else {
      return orderDiagnostics(arr, target, peak, arr.length - 1);
    }

  }

  static int peakIndex(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] > arr[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  static int orderDiagnostics(int[] arr, int target, int start, int end) {
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;


      if(target == arr[mid]){
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
