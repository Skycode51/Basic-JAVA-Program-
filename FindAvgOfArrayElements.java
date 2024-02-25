package akash.learning;
import java.util.Scanner;
              // Find Average of array Elements
public class FindAvgOfArrayElements
{
    public static void main(String[] args) {
        int a[]=new int[5]; int sum=0; double avg;
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter array Elements ");
        for (int i = 0; i <5; i++) {
            a[i]=SC.nextInt();
        }
        System.out.println("array Elements ");
        for (int i = 0; i <5; i++)
        {
            System.out.println(a[i]+" ");
        }
        for (int i = 0; i <5; i++) {
            sum=a[i]+sum;
        }
        avg=sum/5.0;
        System.out.println(sum+"Average "+avg);
    }
}
