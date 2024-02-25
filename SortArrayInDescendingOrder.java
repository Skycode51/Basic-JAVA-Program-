package akash.learning;
import java.util.Scanner;

// Sort Array Elements in Descending Order

public class SortArrayInDescendingOrder
{
    public static void main(String[] args)
    {
        int a[]=new int[50]; int temp;
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter Value in Array:");
        for (int i = 0; i < 5; i++)
        {
           a[i]=SC.nextInt();
        }
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
