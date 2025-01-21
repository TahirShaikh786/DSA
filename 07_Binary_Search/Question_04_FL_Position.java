// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class Question_04_FL_Position {
  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    System.out.println(Arrays.toString(searchRange(nums, target)));
  }

  static int[] searchRange(int[] nums, int target) {
    int[] ans = { -1, -1 };

    // Check for First Occurence if target found
    int start = searchOccur(nums, target, true);
    int end = searchOccur(nums, target, false);
    ans[0] = start;
    ans[1] = end;

    return ans;
  }

  // this function just return the index value of target
  static int searchOccur(int[] nums, int target, boolean findStartIndex){
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;
    
    while(start <= end){
      int mid = start + (end - start) / 2;
      if(target < nums[mid]){
        end = mid - 1;
      }else if(target > nums[mid]){
        start = mid + 1;
      }else{
        // Potential ans found
        ans = mid;
        if(findStartIndex){
          end = mid - 1;
        }else{
          start = mid + 1;
        }
      }
    }
    return ans;
  }
}
