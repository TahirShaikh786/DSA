import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // Taking Input From User Until X/x is Clicked
    while(true){
      // Tahing Operator
      System.out.println("To Close the Program Press (X , x)");

      // Taking Input Number
      System.out.println("Enter 1st Number:- ");
      int n1 = in.nextInt();
      System.out.println("Enter 2nd Number:- ");
      int n2 = in.nextInt();
      System.out.println("Enter Opeartor to perfom Operation:- ");
      char op = in.next().trim().charAt(0);

      if(op == '+'){
        int sum = n1 + n2;
        System.out.println("Addition of 2 Number is " + sum);
      }
      if(op == '-'){
        int sub = n1 - n2;
        System.out.println("Subtraction of 2 Number is " + sub);
      }
      if(op == '*'){
        int mul = n1 * n2;
        System.out.println("Multiplication of 2 Number is " + mul);
      }

      if(op == '/'){
        if(n2 != 0){
          int div = n1 / n2;
          System.out.println("Division of 2 Number is " + div);
        }else{
          System.out.println("Denominator should be Greater than 0");
        }
      }

      if(op == '%'){
        int mod = n1 % n2;
        System.out.println("Remainder is " + mod);
      }

      if(op == 'x' || op == 'X'){
        break;
      }
    }
  }
}
