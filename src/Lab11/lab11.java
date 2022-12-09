package Lab11;

import java.util.Scanner;

public class lab11 {
   
   public static int fibonacci(int n) {
      int startValue = 0;
      int secondValue = 1;
      int i;
      int sum = 0;
      if (n < 0)
         return -1;
      if (n == 0)
         return startValue;
      if (n == 1)
         return secondValue;
      for (i = 0; i < n - 1; ++i) {
         sum = startValue + secondValue;
         startValue = secondValue;
         secondValue = sum;
      }
      return sum;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
