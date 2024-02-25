package akash.learning;
             // Find the Smallest Element
import java.util.Scanner;
public class ArrayFindSmallestElement
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int min;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < a.length; i++)
        {
            a[i]=SC.nextInt();
        }
           min=a[0];
        for (int i = 0; i < args.length; i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Smallest Element "+min);
    }
}
