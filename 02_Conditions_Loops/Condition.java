public class Condition {
  public static void main(String[] args) {
    /*
     if-else Syntax

     if(boolean expresson T/F){
        // body
     }else{
        // do this
     }
     */

     int salary = 25400;
     if (salary > 12000){
      salary += 2000;
     }else{
      salary += 1000;
     }

     System.out.println("If-Else " + salary);

    //  Multiple if-else statement
    if (salary > 20000){
      salary += 3000;
    }else if(salary > 10000){
      salary += 2000;
    }else{
      salary += 1000;
    }

    System.out.println("Multiple If-Else "+ salary);
  }
}
