package akash.learning;
import java.util.Scanner;

          // Print Odd Numbers in Given Range

public class PrintOddNumRange
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter No of Term: ");
        Scanner SC = new Scanner(System.in);
        n = SC.nextInt();

        for (int i = 1; i <=n ; i=i+2)
        {
            System.out.print(i+" ");
        }
    }
}
