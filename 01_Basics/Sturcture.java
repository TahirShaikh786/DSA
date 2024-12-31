import java.util.Scanner;

public class Sturcture{
  public static void main(String[] args){
    // Input
    Scanner input = new Scanner(System.in);
    System.out.println(input.nextLine());

    // Datatypes
    // Primitive DT
    int rollNo = 64;  // 4 Bytes Ca store
    char ch = 's';
    float marks = 98.67f;  // 4 Bytes Ca store
    double largeDecimalNumbers = 45676554.4567;  
    long largeInteger = 34567834567876543L;  // 8 Bytes Ca store
    boolean check = false;

    // When we use Wrapper Class of DT so we can apply methods on Variable
    // Integer val = 45;
    // val.valueOf();

    // To take input in integer
    System.out.println("please Enter RollNo :- ");
    int rn = input.nextInt();
    System.out.println("Your RollNo :- "+ rn);

    // To take input in integer
    System.out.println("please Enter marks :- ");
    float mark = input.nextFloat();
    System.out.println("Your marks :- "+ rn);

    // Non-Primitive DT
    String name = "Tahir";
    // To take input in String
    String name1 = input.next();;
    System.out.println(name1);

    // Output
    System.out.println("Hello World");
  }
}