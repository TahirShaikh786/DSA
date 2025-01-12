package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIP {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Array of Primitives
    int[] arr = new int[5];
    arr[0] = 23;
    arr[1] = 45;
    arr[2] = 55;
    arr[3] = 543;
    arr[4] = 3;
    // Store Like this [23, 45, 55, 543, 3]
    System.out.println(arr[2]);

    // Taking Input for array using for loop
    for (int i = 0; i < arr.length; i++) {
      // arr[i] = in.nextInt();
    }

    /*
      1st way to Display array items using for loop
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i] + " ");
    } 
    */

    /*
     2nd Easiest Way using toString() Method
    System.out.println(Arrays.toString(arr));
    */

    /*
     3rd Way using ForEach Loop used to display array items
    for(int num : arr){
      System.out.print(num + " "); // Here num represents element of the array
    }
    */

    // Array of Objects
    String[] str = new String[4];
    for (int i = 0; i < str.length; i++){
      str[i] = in.next();
    }
    System.out.print(Arrays.toString(str));

    // to Modify it
    str[2] = "Tahir";
    System.out.print(Arrays.toString(str));
  }
}
