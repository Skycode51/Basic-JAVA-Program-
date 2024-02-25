package akash.learning;
import java.util.Scanner;

// Print Multiplication Table
//input number 6
//6*1=6,6*2=12,etc....
public class PrintMultiplicationTable
 {
     public static void main(String[] args)
     {
      int num;
         System.out.println("Enter Any Number ");
         Scanner SC = new Scanner(System.in);
         num= SC.nextInt();

         for (int i = 1; i <=10 ; i++)
         {
             System.out.println(num+"*"+i+"="+num*i);
         }
     }
}
