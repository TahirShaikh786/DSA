import java.util.Scanner;

public class Switch {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Fruits Name :- ");
    String fruits = in.next();

    // If we Don't Use Switch than the Code will become Complex by using if-else For
    // ex:-
    // If we use (==) than it only check that both left and right operand is
    // pointing to same address and (.equal) is used to check only both operands
    // value is same or not
    if (fruits.equals("mango")) {
      System.out.println("King of Fruits");
    }
    if (fruits.equals("apple")) {
      System.out.println("Queen of Fruits");
    }

    // By using Switch case it is simple to check multiple conditions
    switch (fruits.toLowerCase()) {
    case "mango":
      System.out.println("Phallo ka Raja");
      break;

    case "apple":
      System.out.println("Laal Saeb");
      break;

    default:
      System.out.println("Not Fruit");
      break;
    }
    /*
     * Notes:- 1. Cases have to be the same types as expressons, must be a constant
     * or literal 2. Duplicate case values are not allowed 3. Break is used, it will
     * continue to next case 4. default will execute when none of the above case
     * does 5. if default is not at the end, put break after it
     */

    /* Newer Switch
    switch (fruits) {
      case 1 -> System.out.println("King of Fruits");
    
      default -> System.out.println("Hello");
    }
    */
  }
}
