package akash.learning;
             // Sum of First N Natural Numbers
import java.util.Scanner;
public class SumOfNaturalNum
{
    public static void main(String[] args) {
        int n, sum=0;
        System.out.print("Enter No. of Digit: ");
        Scanner SC = new Scanner(System.in);
          n = SC.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            sum = sum+i;
        }
        System.out.print("Addition "+ sum);
    }
}
