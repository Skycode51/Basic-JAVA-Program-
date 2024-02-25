package akash.learning;
import java.util.Scanner;
// Eligible for Vote or Not
public class VoteEligible
     {
         public static void main(String[] args) {
             int age;
             System.out.println("Enter the Age: ");
             Scanner SC=new Scanner(System.in);
             age = SC.nextInt();

             if (age>=18)
             {
                 System.out.println("Eligible for Vote ");
             }
             else
             {
                 System.out.println("Not Eligible for Vote ");
             }
         }
}
