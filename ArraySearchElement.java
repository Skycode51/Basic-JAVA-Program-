package akash.learning;
import java.util.Scanner;
// Search Array Elements
public class ArraySearchElement {
        public static void main(String[] args) {
            int a[]=new int[5];
            int n,count=0; //a[5]= 10 20 30 40 50
            Scanner SC = new Scanner(System.in);
            System.out.println("Enter Elements in Array: ");
            for (int i = 0; i < a.length; i++) {
                a[i]= SC.nextInt();
            }
            System.out.println("Array Elements "); //i=0
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]+" ");
            } // Search item 50 ---> Item Found
            System.out.println("Enter Search Elements ");
            n=SC.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (a[i]==n){ //10==20 False //20==20 True
                    count++;
                }
            }
            if (count>0)
                System.out.println("Item Found"+count+"times");
            else
                System.out.println("Item Not Found");
        }
}
