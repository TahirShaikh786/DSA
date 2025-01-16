public class LS {
  public static void main(String[] args) {
    int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
    int target = 19;
    int element = linearSearch1(nums, target);
    System.out.println(element);

    boolean value = linearSearch3(nums, target);
    System.out.println(value);

    int index = linearSearch2(nums, target);
    if(index > nums.length){
      System.out.println("The Given Element is not Present in Array");
    }else{
      System.out.println("The Given Element is at index " + index);
    }
  }

  /*
   * Search in the Array: Return the element if item found
   */
  static int linearSearch1 (int[] arr, int target){
    if(arr.length == 0){
      return -1;
    }

    for(int element : arr){
      if(element == target){
        return element;
      }
    }
    return -1;
  }


  /*
   * Search in the Array: Return the index if item found
   * or else Return -1 if not found
   */
  static int linearSearch2 (int[] arr, int target){
    if(arr.length == 0){
      return -1;
    }

    // Run the For Loop
    for (int i = 0; i < arr.length; i++){
      // Check for element at each index
      int element = arr[i];
      if(element == target){
        return i;
      }
    }
    return Integer.MAX_VALUE;
  }


  /*
   * Search in the Array: Return Boolean Values
   */
  static boolean linearSearch3 (int[] arr, int target){
    if(arr.length == 0){
      return false;
    }

    for(int element : arr){
      if(element == target){
        return true;
      }
    }
    return false;
  }
}
