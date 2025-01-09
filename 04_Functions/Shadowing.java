public class Shadowing {
  // it is accessible to every method in this class
  static int x = 90; // this will be shadowed at line 7
  public static void main(String[] args) {
   System.out.println(x); // 90
   int x = 40; // the class variable at line 3 is shadowed by this
   System.out.println(x); // 40
   fun();
  }
  static void fun(){
    System.out.println(x);
  }
}
