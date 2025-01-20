import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    in.close();

    // Initialization
    for(int i = 0; i < 3; i++){
      list.add(new ArrayList<>());
    }

    // add Elements
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        list.get(i).add(in.nextInt());
      }
    }

    System.out.println(list);
  }
}
