package akash.learning;

import java.util.Scanner;

// Find Greatest Value between two number
public class FindGreatestNum {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Enter Two Number: ");
        Scanner SC= new Scanner(System.in);
        a= SC.nextInt();
        b= SC.nextInt();
        if (a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
