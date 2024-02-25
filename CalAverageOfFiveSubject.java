package akash.learning;
import java.util.Scanner;
// Calculate average marks of Five Subject
public class CalAverageOfFiveSubject
 {
     public static void main(String[] args) {
       int a,b,c,d,e;
         System.out.println("Enter marks of Five Subject:");
         Scanner SC = new Scanner(System.in);
         a=SC.nextInt();
         b=SC.nextInt();
         c=SC.nextInt();
         d=SC.nextInt();
         e=SC.nextInt();

         int sum=a+b+c+d+e;
         System.out.println("Total Marks"+ sum);

         double avg=sum/5.0;
         System.out.println("Average marks"+ avg);

     }
}
