public class Swap {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    swap(a, b);
    String name = "Tahir";
    changeName(name);
    System.out.println(name);
  }

  static void changeName(String naam){
    naam = "Tahir Shaikh"; // Creating a new object
    System.out.println(naam);
  }

  // In java the paramenter is pass by value so made changes in the function the actual value will not be change
  static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp; // This Change is only valid in this function scope only.
  }
}
