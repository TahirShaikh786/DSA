import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // For Loop :- Print numbers from 1 to 5
    
    for(int i = 1; i <= 5; i++){
      System.out.print("For Loop:-" + i + " ");
    }

    //  Print Number from 1 to N
    System.out.print("\nEnter Number to Iterate :- ");
    int num = input.nextInt();
    for(int i = 1; i <= num; i++){
      System.out.print("For Loop(1-N):-" + i + " ");
    }

    // While Loop :- Print numbers from 1 to 5
    int i = 1;
    while(i <= 5){
      System.out.print("While Loop " + i + " ");
      i++;
    }

    // dO-while Loop :- When we want to execute loop atleast 1 time
    int j = 1;
    do{
      System.out.print("Do-While Loop " + j + " ");
    }while( j != 1 );
  }
}
