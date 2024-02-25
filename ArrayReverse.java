package akash.learning;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
       // Print Array elements in reverse Order
        int a[]=new int[5];
        Scanner A = new Scanner(System.in);
        System.out.println("Enter The Elements In Array");
        for (int i = 0; i < a.length; i++)
        {
            a[i]=A.nextInt();
        }
        System.out.println("Array Elements ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("Array reverse elements ");
        for (int i = 5-1; i >=0; i--)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
