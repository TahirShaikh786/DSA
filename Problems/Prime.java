import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean ch = isPrime(n);
    System.out.println(ch ? "is Prime Number" : "is not Prime Number");
  }

  static boolean isPrime(int n){
    if (n <= 1){
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n);i++){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }
}
