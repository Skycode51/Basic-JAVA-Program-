package akash.learning;
import java.util.Scanner;
// Insert item in Array // a[3]= 34 67 23 //loc=1 item=100 //a[3+1]=34 100 67 23
public class InsertItemInArray {
    public static void main(String[] args) {
        int size,loc,item;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        size=SC.nextInt();
        int a[]=new int[size+1];
        System.out.println("enter Array Elements: ");
        for (int i = 0; i <size; i++) {
            a[i]=SC.nextInt();
        }
        System.out.println("Enter Array loction: ");
        loc=SC.nextInt();
        System.out.println("Enter new item: ");
        item=SC.nextInt();
        for (int i = 0; i <size ; i++) {
            a[i]=a[i-1];
        }
         a[loc]=item;
          size++;
         for (int i = 0; i <size; i++) {
                System.out.println(a[i]+" ");
            }
        }
    }

