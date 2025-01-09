public class Overloading {
  public static void main(String[] args) {
    fun(6);
    fun(6, 7);
    fun("Tahir");
  }

  static void fun(int a){
    System.out.println(a);
  }

  static void fun(int a, int b){
    System.out.println(a + " " + b);
  }

  static void fun(String name){
    System.out.println(name);
  }
}
