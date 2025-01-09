import java.util.Scanner;

public class Cal {
  static void greeting() {
    System.out.println("Hellow World");
  }

  static void Sum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 Numbers :- ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int sum = n1 + n2;
    System.out.println("Addition is :- " + sum);
  }

  // With Return type int
  static int Sum2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 Numbers :- ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int sum = n1 + n2;
    return sum;
  }

  // With Return Type String
  static String greet() {
    String greeting = "How are you";
    return greeting;
  }

  // Parametrized Functions
  static int Sum3(int a, int b){
    int sum = a + b;
    return sum;
  }

  static String myGreet(String name){
    String message = "Hello " + name;
    return message;
  }

  public static void main(String[] args) {
    // String message = greet();
    // System.out.println(message);
    // Sum();
    // int ans = Sum2();
    // System.out.println(ans);
    // Sum3(1, 2);
    // greeting();
    String name = myGreet("Tahir Shaikh");
    System.out.println(name);
  }
}
