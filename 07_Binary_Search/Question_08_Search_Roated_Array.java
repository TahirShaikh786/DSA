// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class Question_08_Search_Roated_Array {
  public static void main(String[] args) {
    int[] nums = { 5,1,3 };
    int target = 5;
    System.out.println("The Index of " + target + " is " + search(nums, target));
  }

  static int search(int[] nums, int target) {
    int pivot = findPivot(nums);
    int findIndex = binarySearch(nums, target, 0, pivot);
    if (findIndex != -1) {
      return findIndex;
    }
    return binarySearch(nums, target, pivot + 1, nums.length - 1);
  }

  static int findPivot(int[] nums) {
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      // 4 cases
      if(mid < end && nums[mid] > nums[mid+1]){
        return mid;
      }
      if (mid > start && nums[mid] < nums[mid - 1]) {
        return mid - 1;
      }
      if(nums[mid] <= nums[start]){
        end = mid - 1;
      }else{
        start = mid + 1;
      }
    }
    return -1;
  }

  static int binarySearch(int[] nums, int target, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target > nums[mid]) {
        start = mid + 1;
      } else if (target < nums[mid]) {
        end = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}