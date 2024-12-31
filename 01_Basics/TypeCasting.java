import java.util.Scanner;

public class TypeCasting {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Float to Integer (Type Casting)
    int num = (int)(67.56f);
    System.out.println(num);

    // Automatic type promotion in expressions
    int a = 257;  // byte can store only 256 byte it
    byte b = (byte)(a);  // 257 % 256 = 1
    System.out.println(b);

    // Char to Integer
    int asciiNum = 'A';
    System.out.println(asciiNum);

    System.out.println(3 * 56.258);  // It return double value

    byte by = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = 0.1234;
    double result = (f * by) + (i / c) - (d * s); // float + int - double = double
    System.out.println((f * by) + " " + (i / c) + " " + (d * s));
    System.out.println(result); // double
  }
}
