package akash.learning;
       //Sort() Array
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_sort {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Data in Array ");
        for (int i = 0; i < a.length; i++) {
            a[i]=SC.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
