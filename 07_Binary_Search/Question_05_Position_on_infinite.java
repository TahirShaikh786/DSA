// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// In this question we don't use array length property

public class Question_05_Position_on_infinite {
  public static void main(String[] args) {
    int[] nums = {3, 5, 7, 9, 10, 98, 100, 130, 140, 160, 170};
    int target = 98;
    
    int ans = findingRange(nums, target);
    System.out.println("The Element is at index " + ans);
  }
  
  static int findingRange(int[] arr, int target){
    // FIrst find the range
    // First start with a box size 2
    int start = 0;
    int end = 1;

    // Condition for the target tgat lie in the range
    while(target > arr[end]){
      int temp = end + 1; // stores new Start value
      // Double the box value
      // end = previous end + sizeofbox + 2
      end = end + (end - start + 1) * 2; 
      start = temp;
    }
    return searchOnInfiniteArr(arr, target, start, end);
  }

  static int searchOnInfiniteArr(int[] arr, int target, int start, int end){
    while(start <= end){
      int mid = start + (end - start) / 2;

      if(target < arr[mid]){
        end = mid - 1;
      }else if(target > arr[mid]){
        start = mid + 1;
      }else{
        return mid;
      }
    }
    return -1;
  }
}
