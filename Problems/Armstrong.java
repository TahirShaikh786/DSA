public class Armstrong {
  public static void main(String[] args) {
    for(int i = 100; i < 1000; i++){
      if(checkArm(i)){
        System.out.println(i + " is Armstrong Number");
      }
    }
  }

  static boolean checkArm(int n){
    int tmp = n;
    int sum = 0;
    while (n > 0) {
      int rem = n % 10;
      n = n / 10;
      sum = sum + rem*rem*rem;
    }
    return sum == tmp;
  }
}
