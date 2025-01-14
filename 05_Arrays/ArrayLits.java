import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLits {
  public static void main(String[] args) {
    // When we don't konwn About the size of the array then we use ArrayList
    Scanner in = new Scanner(System.in);

    // IN <> bracket we cannot pass primitive Datatype Instead of this Using Wrapper Class.
    ArrayList<Integer> list = new ArrayList<>(10);
    // list.add(67);
    // list.add(78);
    // list.add(23);
    // list.add(323);
    // list.add(624);
    // list.add(64524);
    // list.add(626564);
    // list.add(62524);
    // list.add(6224);
    // list.add(62234);
    // list.add(62453);
    // list.add(6246);
    // list.add(6246);
    // list.add(6234);

    // To Check ELement is there in List or not
    // System.out.println(list.contains(624));
    
    // System.out.println(list);
    // // Update Value at specific index
    // list.set(0, 99);

    // System.out.println(list);

    // Taking Input
    for(int i = 0; i < 5; i++){
      list.add(in.nextInt());
    }

    // Displaying ArrayList Item
    for(int i = 0; i < 5; i++){
      System.out.print(list.get(i) + " ");
    }

    System.out.println(list);
  }
}
