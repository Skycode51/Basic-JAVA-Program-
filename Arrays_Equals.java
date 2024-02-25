package akash.learning;
import java.util.Arrays;
import java.util.Scanner;
// Arrays Equals()
public class Arrays_Equals {
    public static void main(String[] args) {
        int a[]=new int[5];
        int a2[]=new int[5];
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter Data in Array ");

        for (int i = 0; i < a.length; i++) {
            a[i]=SC.nextInt();
        }
        System.out.println("Enter Data in Array2 ");
        for (int i = 0; i < a2.length; i++) {
            a2[i]=SC.nextInt();
        }
        boolean b= Arrays.equals(a,a2);
        System.out.println("Is both array equal ? "+b);
    }
}
