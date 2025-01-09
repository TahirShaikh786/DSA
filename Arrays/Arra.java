package Arrays;

public class Arra {
  public static void main(String[] args) {
    // Q. Store a Roll No.
    int rNo = 01;

    // Q. Stores a Person's Name
    String name = "Tahir Shaikh";

    // Q. Store 5 Roll Number
    // It is complex because it takes more space
    int rNo1 = 23;
    int rNo2 = 24;
    int rNo3 = 25;
    int rNo4 = 26;
    int rNo5 = 27;

    // Syntax
    // datatype[] variable_name = new datatype[size];

    // Q. Store 5 Roll Number using Array
    // Array is a Collection of Data Types & all the elements in the array should be of same type.
    int[] rollNo = new int[5];
    // Or Directly
    int[] rollNo1 = {23, 12, 45, 32, 15};

    // Lets Deep Dive into it
    int[] ros; // Declaration of array, ros is getting defined in the stack.
    ros = new int[5]; // actually here object is being created in the memory (heap).
    // New Keyword is used to create a Object 
    System.out.println(ros[0]);

    String[] arr = new String[4];
    System.out.println(arr[0]);
  }
}
