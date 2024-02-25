package akash.learning;
import java.util.Scanner;

      // Find factorial of number
     // Input 5 ----> 120 (5*4*3*2*1)

public class FindFactorialNum
{
    public static void main(String[] args)
    {
      int n, fact=1;  // 5
        System.out.println("Enter Any Number: ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
         fact=fact*i; //formula
        }
        System.out.println("factorial "+ fact);
    }
}
