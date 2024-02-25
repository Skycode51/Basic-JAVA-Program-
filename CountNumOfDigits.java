package akash.learning;
  // Count number of Digits
 //input 285885

import java.util.Scanner;

public class CountNumOfDigits
  {
      public static void main(String[] args) {

          int n, count=0;
          System.out.println("Enter Any Number: ");
          Scanner SC =new Scanner(System.in);
          n = SC.nextInt();

          while (n>0) //yes
          {
              n=n/10;
              count++;  //Exit when after 6 digit
          }
          // After 6 digit Exit loop and Result
          System.out.println("No. of Digit "+ count);
      }
}
