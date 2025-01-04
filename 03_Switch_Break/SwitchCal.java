import java.util.Scanner;

public class SwitchCal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("To Close the Program Press (X, x)");
      System.out.println("Enter First Number:- ");
      int n1 = sc.nextInt();
      System.out.println("Enter Operator:- ");
      char op = sc.next().charAt(0);
      System.out.println("Enter Second Number:- ");
      int n2 = sc.nextInt();

      switch (op) {
        case '+':
          int sum = n1 + n2;
          System.out.println("Addition :- " + sum);
          break;
        
        case '-':
          int sub = n1 - n2;
          System.out.println("Subtraction :- " + sub);
          break;

        case '/':
          if(n2 != 0){
            int div = n1 / n2;
            System.out.println("Division :- " + div);
          }else{
            System.out.println("Denominator should be Greater than 0");
          }
          break;
        
        case '%':
          int rem = n1 % n2;
          System.out.println("Remainder :- " + rem);
          break;

        case 'X':
          return;
        
        case 'x':
          return;

        default:
          System.out.println("Not a Valid Operator");
          break;
      }
    }
  }
}
