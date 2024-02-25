package akash.learning;

import java.util.Scanner;

public class ArrayLengthFind {
    public static void main(String[] args) {
        // Find the Length of Arrays
        int a[]=new int[10];
        Scanner A = new Scanner(System.in);
        System.out.println("Enter The Elements In Array");
        for (int i = 0; i < a.length; i++)
        {
            a[i]=A.nextInt();
        }
        System.out.println("Array Elements ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("Array Length " + a.length );
    }
}
