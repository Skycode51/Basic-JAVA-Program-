package akash.learning;
import java.util.Scanner;
// Calculate Power of number
    // Input n= 5
    // power p=3
    // 5*5*5=125
public class CalPowerOfNum
   {
       public static void main(String[] args) {
           int n,p,result=1;
           System.out.println("Enter No. ");
           Scanner SC= new Scanner(System.in);
           n=SC.nextInt();
           p=SC.nextInt();
           System.out.println("Enter Power ");

           for (int i = 1; i <=p ; i++)
           {
            result=n*result;
           }
           System.out.println("Power " + result);
       }
}
