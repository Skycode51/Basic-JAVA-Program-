package akash.learning;
import java.util.Scanner;
                      // Find Biggest Element in Arrays
public class ArrayFindBiggestElements {
    public static void main(String[] args) {

        int a[]=new int[5]; int max;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < 5; i++)
        {
           a[i]= SC.nextInt();
        }
        max=a[0];
        for (int i = 1; i <5; i++)
        {
          if (a[i]>max){
              max=a[i];
          }
        }
        System.out.println("Maximum Element" + max);
    }
}
