public class Question_01_Ceiling {
  public static void main(String[] args) {
    int[] ascNums = {2, 3, 5, 9, 14, 16, 18};
    int ascTar = 10;
    int ans = Ceiling_Of_number(ascNums, ascTar);
    System.out.println("The Ascending target is " + ascTar + " & Ceiling Number is " + ascNums[ans]);

    int[] descNums = {200, 150, 99, 50, 43, 20, 5, 0, -4, -8, -16};
    int descTar = 4;
    int ans2 = Ceiling_Of_number(descNums, descTar);
    System.out.println("The Descending target is " + descTar + " & Ceiling Number is " + descNums[ans2]);
  }

  static int Ceiling_Of_number(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;
    boolean isAsc = arr[start] < arr[end];

    while(start <= end){
      int mid = start + (end - start) / 2;
      if(arr[mid] == target){
        return mid;
      }
      if(isAsc){
        if(target < arr[mid]){
          end = mid - 1;
        }
        else{
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
    return start;
  }
}
