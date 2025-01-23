// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Question_06_Mountain_Array {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 0 };
    System.out.println(peakIndexInMountainArray(arr));
  }

  static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while(start < end){
      int mid = start + (end - start) / 2;

      if(arr[mid] > arr[mid + 1]){
        // You are in decreasing part of array
        // This may be the ans, but look at left
        // This is why end != mid - 1
        end = mid;
      }
      else {
        // You are in a asc part of array
        start = mid + 1; // because we known that mid + 1 element > mid element
      }
    }
    // In the end, start == end and pointing to the largest number because if the 2 checks
    // start & end are always trying to find max element in the above 2 checks
    // Hence, when they are pointing to just one element, that is the peak point
    return start;
  }
}
