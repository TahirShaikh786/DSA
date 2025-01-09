public class Scopes {
  public static void main(String[] args) {
    // Anything intialised outside of the scope can use in block scopes but anything initialized in block scope cannot accessible outside of this scope
    int a = 10;
    int b = 20;
    // System.out.println(num); // We Cannot access this because of function scope it is outside of the random functon
    {
      /* In Block Scope we cannot re-initialized the same name variable. but we can cahnge the value
          int a = 20; // It will give error
      */
      a = 70;
      // The defined inside the block scope it will remian in this block only
      int c = 99;
    }
    // System.out.println(c); // It will give error because it is ouside the block.


    // Scoping in Loops:- the variable i cannot accessible outside of this block
    for(int i = 0; i < 4; i++){
      System.out.println(i);
    }
  }

  static void methodScope(){
    int num = 67;
    System.out.println(num);
  }

}
