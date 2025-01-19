public class Question_02_Floor {
  public static void main(String[] args) {
    int[] ascNums = {2, 3, 5, 9, 14, 16, 18};
    int ascTar = 14;
    int ans = FloorOfNumber(ascNums, ascTar);
    System.out.println(ans);
    System.out.println("The Ascending Array target Number is " + ascTar + " & the Floor Value is " + ascNums[ans]);
  }

  static int FloorOfNumber(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;
    
    boolean isAsc = arr[start] < arr[end];
    
    while(start <= end){
      int mid = start + (end - start) / 2;
      if(target == arr[mid]){
        return mid;
      }
      if(isAsc){
        if(target < arr[mid]){
          end = mid - 1;
        }else{
          start = mid + 1;
        }
      }else{
        if(target < arr[mid]){
          start = mid + 1;
        }else{
          end = mid - 1;
        }
      }
    }

    return end;
  }
}
