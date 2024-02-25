package akash.learning;
import java.util.Scanner;
public class CopyArrays {
    public static void main(String[] args) {
        // Copy Array Element  A{10 20 30 }=B{10 20 30}
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the Elements In Array: ");
        for (int i = 0; i < 5; i++)
        {
             a[i]=A.nextInt();
        }
        System.out.println("First Array Elements: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println("\nSecond Array Elements: ");
        for (int i = 0; i < 5; i++)
        {
            b[i]=a[i];
            System.out.print(a[i]+ " ");
        }
    }
}
