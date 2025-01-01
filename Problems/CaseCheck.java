import java.util.Scanner;

public class CaseCheck {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Character to check Case:- ");
    char ch = in.next().trim().charAt(0);

    if(ch >= 'a' && ch <= 'z'){
      System.out.println(ch + " is Lowercase");
    }else{
      System.out.println(ch + " is Uppercase");
    }
  }
}
