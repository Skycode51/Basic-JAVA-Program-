package akash.learning;
import java.util.Scanner;
/* Print Even Numbers in Given Range */
public class PrintEvenNum
{
    public static void main(String[] args) {
        int n;
        System.out.print("enter No of Term: ");
        Scanner SC = new Scanner(System.in);
        n = SC.nextInt();

        for (int i = 0; i <=n ; i=i+2)
        {
            System.out.print(i+ " ");
        }
    }

}
