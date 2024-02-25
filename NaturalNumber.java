package akash.learning;
           // Natural Numbers
import java.util.Scanner;

public class NaturalNumber
{
    public static void main(String[] args) {

        int n;
        System.out.print("Enter no. of Digit to Print: ");
        Scanner SC = new Scanner(System.in);    // Input User
        n= SC.nextInt();

        for (int i = 1; i <=n ; i++)           //Output
        {
            System.out.print(i + " ");
        }
    }
}
