import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter The Number of Fibonacci series You Want:- ");
    int n = in.nextInt();
    int a = 0, b = 1;
    for(int i = 2; i <= n; i++){
      int temp = a + b;
      a = b;
      b = temp;
    }
    System.out.println("The " +  n + " Fibonacci value is " + b);
  }
}
