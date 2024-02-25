package akash.learning;
import java.util.Scanner;
       // Find Sum of Array Elements //
public class SumOfArray {
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int sum=0;
        Scanner SC =new Scanner(System.in);
        System.out.print("enter Elements in Array ");
        for (int i = 0; i < a.length; i++)
        {
          a[i]= SC.nextInt();
        }
        System.out.print("Array Elements");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]+" ");
            sum=a[i]+sum;
        }
        System.out.println("Addition of Array Elements "+sum);
    }
}
