import java.util.Scanner;

public class Question_01_String {

  // Search in Strings
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a String without:-");
    String str = in.next();
    System.out.println("Enter a Character you want to Search from your String");
    char target = in.next().charAt(0);
    in.close();
    System.out.println(searchString(str, target));
  }

  static boolean searchString(String str, char ch){
    if(str.length() == 0){
      return false;
    }

    for(int i = 0; i < str.length(); i++){
      if(ch == str.charAt(i)){
        return true;
      }
    }
    return false;
  }
}
