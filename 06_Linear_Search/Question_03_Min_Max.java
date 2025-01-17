public class Question_03_Min_Max {
  public static void main(String[] args) {
    int[] nums = {99, 45, 78, 25, 56, 105, 22};
    System.out.println(Maximum_IN_Range(nums, 1, 4));
  }

  // Minimum Value
  static int Find_Minimum(int[] arr){
    if(arr.length == 0){
      return -1;
    }

    int min = arr[0];
    for(int i = 1; i < arr.length; i++){
      if(min > arr[i]){
        min = arr[i];
      }
    }
    return min;
  }

  // Find Maximum Value
  static int Find_Maximum(int[] arr){
    if(arr.length == 0){
      return -1;
    }

    int max = arr[0];
    for(int i = 1; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }

  // Find Minimum Value Between Range
  static int Minimum_IN_Range(int[] arr, int start, int end){
    if (arr.length == 0){
      return -1;
    }

    int min = arr[start];
    for (int i = start + 1; i <= end; i++){
      if(min > arr[i]){
        min = arr[i];
      }
    }
    return min;
  }

  // Find Maximum Value Between Range
  static int Maximum_IN_Range(int[] arr, int start, int end){
    if (arr.length == 0){
      return -1;
    }

    int max = arr[start];
    for (int i = start + 1; i <= end; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
}
