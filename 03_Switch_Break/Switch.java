import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Fruits Name :- ");
    String fruits = in.next();

    // If we Don't Use Switch than the Code will become Complex by using if-else For ex:-
    // If we use (==) than  it only check that both left and right operand is pointing to same address and (.equal) is used to check only both operands value is same or not
    if(fruits.equals("mango")){
      System.out.println("King of Fruits");
    }
    if(fruits.equals("apple")){
      System.out.println("Queen of Fruits");
    }

    // By using Switch case it is simple to check multiple conditions
    switch (fruits) {
      case "mango":
        System.out.println("Phallo ka Raja");
        break;

      case "Mango":
        System.out.println("Phallo ka Raja");
        break;
      
      case "apple":
        System.out.println("Laal Saeb");
        break;
      
      case "Apple":
        System.out.println("Laal Saeb");
        break;
    
      default:
        System.out.println("Not Fruit");
        break;
    }
  }
}
