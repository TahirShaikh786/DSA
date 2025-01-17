// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Question_05_Even_Digits {
  public static void main(String[] args) {
    int[] nums = {12, 345, 2, 6, 7896, 256535};

    int ans = find_Digits(nums);
    System.out.println(ans);

    System.out.println(Optimised_Digit_Count(123456));
  }

  static int find_Digits(int[] arr){
    int count = 0;
    if (arr.length == 0){
      return 0;
    }

    for(int num : arr){
      if(even_digit(num)){
        count++;
      }
    }
    return count;
  }

  // Function to check whether a number contains even digits or not
  static boolean even_digit(int num){
    int count = digits(num);
    return count % 2 == 0;
  }

  // Function to Count Digits.
  static int digits(int num){
    int count = 0;

    if(num < 0){
      num *= -1;
    }

    if(num == 0){
      return 1;
    }
    
    while(num > 0){
      count++;
      num /= 10;
    }
    return count;
  }

  // Optimised Function to Count Digits
  static int Optimised_Digit_Count(int num){
    System.out.println(Math.log10(num));
    return (int)(Math.log10(num)) + 1;
  }
}
