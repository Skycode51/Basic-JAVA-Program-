package akash.learning;

import java.util.Scanner;

// IF Else if Ladder//
public class IfElseIf {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks>80)
        {
            System.out.println("Topper");
        } else if (marks<80 && marks>=60)
        {
            System.out.println("first Class");

        }else {
            System.out.println("Second Class");

        }
    }
}
