
// Variable length Argument

import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    fun(2, 3, 4, 5, 6, 7, 8, 9, 10);
    message("T", "a", "h", "i", "r");
    // Multiple arg
    multiple(10, 60.09, "Tahir", "Shaikh");
  }

  static void fun(int ...v){
    System.out.println(Arrays.toString(v));
  }

  static void message(String ...msg){
    System.out.println(Arrays.toString(msg));
  }

  static void multiple(int a, double b, String ...n){
    System.out.println(a);
    System.out.println(b);
    System.out.println(Arrays.toString(n));
  }
}
