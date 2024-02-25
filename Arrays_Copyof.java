package akash.learning;
import java.util.Arrays;
import java.util.Scanner;
                     // Arrays Copyof()
public class Arrays_Copyof
                     {
      public static void main(String[] args)
      {
          int a[]=new int[5];
          Scanner SC = new Scanner(System.in);

          System.out.println("Enter Data in Array ");
          for (int i = 0; i < a.length; i++)
          {
              a[i]=SC.nextInt();
          }
          int a2[]=Arrays.copyOf(a,5);
          System.out.println("Data in Array2 ");
          for (int i = 0; i < a2.length; i++)
          {
              System.out.println(a2[i]+" ");
          }
      }
}
