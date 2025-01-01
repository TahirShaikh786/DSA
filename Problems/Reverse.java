import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Numbers to do reverse:- ");
    int n = in.nextInt();
    int reverse = 0;

    while(n > 0){
      int rem = n % 10;
      reverse = reverse * 10 + rem;
      n = n / 10;
    }
    System.out.println("Your Reverse Number is " + reverse);
  }
}
