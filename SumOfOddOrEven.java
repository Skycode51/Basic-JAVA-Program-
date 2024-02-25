package akash.learning;
import java.util.Scanner;
/* Print sum of odd or Even in Given Range */
public class SumOfOddOrEven {
    public static void main(String[] args)
    {
       int n, sum=0;
        System.out.print("Enter Range: ");
        Scanner SC=new Scanner(System.in);
        n = SC.nextInt();

        if(n%2==0){
            for (int i = 0; i <=n ; i=i+2)  //Even n = 10 (0+2+4+6+8+10 = 30)
            {
             sum=sum+i;
            }
            System.out.print("sum of Even Number" + sum);
        }
        else
        {
            for (int i = 1; i <=n; i=i+2) //Odd n = 11 (1+3+5+7+9+11 = 35)
            {
              sum=sum+i;
            }
            System.out.print("sum of Even Number"+sum);
        }
    }
}
