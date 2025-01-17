public class Question_02_Range {
  public static void main(String[] args) {
    int[] nums = { 12, 32, 45, 74, 85, 255, -23 };
    System.out.println(Search_IN_Range(nums, 0, 5, 12));
  }

  static boolean Search_IN_Range(int[] arr, int start, int end, int target) {
    if (arr.length == 0) {
      return false;
    }
    for (int i = start; i <= end; i++) {
      int element = arr[i];
      if (element == target) {
        return true;
      }
    }
    return false;
  }
}
