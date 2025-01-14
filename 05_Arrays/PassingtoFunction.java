import java.util.Arrays;
import java.util.Scanner;

public class PassingtoFunction {
  public static void main(String[] args) {
    int[] nums = {1, 2, 33, 121};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));
  }
  
  static void change(int[] arr){
    Scanner in = new Scanner(System.in);
    System.out.println("In which Index you want to Change Element");
    int i = in.nextInt();
    System.out.println("Enter Element to Change with");
    arr[i] = in.nextInt();
  }
}
