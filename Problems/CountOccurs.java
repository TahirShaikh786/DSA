import java.util.Scanner;

public class CountOccurs {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter list of Numbers :- ");
    int number = in.nextInt();
    System.out.println("Enter number to check how many times it appear :- ");
    int n = in.nextInt();
    int count = 0;

    while(number > 0){
      int rem = number % 10;
      if (rem == n){
        count++;
      }
      number = number / 10;
    }
    System.out.println("The Occurence of " + n + " is " + count);
  }
}
