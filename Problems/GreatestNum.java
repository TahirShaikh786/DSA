import java.util.Scanner;

public class GreatestNum {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.print("Enter 1st Number:- ");
    int n1 = ip.nextInt();

    System.out.print("Enter 2nd Number:- ");
    int n2 = ip.nextInt();

    System.out.print("Enter 3rd Number:- ");
    int n3 = ip.nextInt();

    // 1st way of Doing
    if (n1 > n2 && n1 > n3){
      System.out.println("Num1 is Greatest Among all");
    }else if(n2 > n1 && n2 > n3){
      System.out.println("Num2 is Greatest Among all");
    }else{
      System.out.println("Num3 is Greatest Among all ");
    }

    // 2nd way of Doing
    int max = n1;
    if (n2 > max){
      max = n2;
    }
    if (n3 > max){
      max = n3;
    }
    System.out.println("Max Number is " + max);

    // 3rd way of Doing
    int maxi = Math.max(n3, Math.max(n1, n2));
    System.out.println(maxi);
  }
}
